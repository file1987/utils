package com.studio.elephant.utils;

import static java.lang.Math.PI;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import static java.lang.Math.toRadians;

public class MyPolyUtils {
	
	/**
	 * Computes whether the given point lies inside the specified geodisic polygon.
	 *
	 * The polygon is always cosidered closed,
	 * regardless of whether the last point equals the first or not.
	 * Inside is defined as not containing the South Pole -- the South Pole is always outside.
	 * The polygon is formed of great circle segments.
	 *
	 * @param point the point to check for.
	 * @param polygon the polygon, [[latitudes...], [longitudes...]].
	 * @return true if the point lies inside.
	 */
	public static boolean containsLocation( Location point, Location[] polygon ) {
		
		final int size = polygon == null ? 0 : polygon.length;
		
		if ( size == 0 ) {
			return false;
		}

		double lat3 = toRadians( point.lat );
		double lng3 = toRadians( point.lng );

		double lat1 = latitude( polygon, size - 1 );
		double lng1 = longitude( polygon, size - 1 );

		int nIntersect = 0;

		for ( int i = 0; i < size; ++i ) {
			double dLng3 = wrap( lng3 - lng1, -PI, PI );
			// Special case: point equal to vertex is inside.
			if ( lat3 == lat1 && dLng3 == 0 ) {
				return true;
			}
			double lat2 = latitude( polygon, i );
			double lng2 = longitude( polygon, i );

			// Offset longitudes by -lng1.
			if ( intersects( lat1, lat2, wrap( lng2 - lng1, -PI, PI ), lat3, dLng3 ) ) {
				++nIntersect;
			}
			lat1 = lat2;
			lng1 = lng2;
		}

		return (nIntersect & 1) != 0;
	}

	private static double latitude( Location[] polygon, int i ) {
		return toRadians( polygon[i].lat );
	}

	private static double longitude( Location[] polygon, int i ) {
		return toRadians( polygon[i].lng );
	}

	/**
	 * Computes whether the vertical segment (lat3, lng3) to South Pole intersects the segment
	 * (lat1, lng1) to (lat2, lng2).
	 * Longitudes are offset by -lng1; the implicit lng1 becomes 0.
	 */
	private static boolean intersects( double lat1, double lat2, double lng2, double lat3, double lng3 ) {
		// Both ends on the same side of lng3.
		if ( (lng3 >= 0 && lng3 >= lng2) || (lng3 < 0 && lng3 < lng2) ) {
			return false;
		}
		// Point is South Pole.
		if ( lat3 <= -PI / 2 ) {
			return false;
		}
		// Any segment end is a pole.
		if ( lat1 <= -PI / 2 || lat2 <= -PI / 2 || lat1 >= PI / 2 || lat2 >= PI / 2 ) {
			return false;
		}
		if ( lng2 <= -PI ) {
			return false;
		}
		double linearLat = (lat1 * (lng2 - lng3) + lat2 * lng3) / lng2;
		// Northern hemisphere and point under lat-lng line.
		if ( lat1 >= 0 && lat2 >= 0 && lat3 < linearLat ) {
			return false;
		}
		// Southern hemisphere and point above lat-lng line.
		if ( lat1 <= 0 && lat2 <= 0 && lat3 >= linearLat ) {
			return true;
		}
		// North Pole.
		if ( lat3 >= PI / 2 ) {
			return true;
		}
		// Compare lat3 with latitude on the GC/Rhumb segment corresponding to lng3.
		// Compare through a strictly-increasing function (tan() or mercator()) as convenient.
		return tan( lat3 ) >= tanLatGC( lat1, lat2, lng2, lng3 );
	}

	/**
	 * Returns tan(latitude-at-lng3) on the great circle (lat1, lng1) to (lat2, lng2). lng1==0.
	 * See http://williams.best.vwh.net/avform.htm .
	 */
	private static double tanLatGC( double lat1, double lat2, double lng2, double lng3 ) {
		return (tan( lat1 ) * sin( lng2 - lng3 ) + tan( lat2 ) * sin( lng3 )) / sin( lng2 );
	}

	/**
	 * Wraps the given value into the inclusive-exclusive interval between min and max.
	 * @param n   The value to wrap.
	 * @param min The minimum.
	 * @param max The maximum.
	 */
	static double wrap( double n, double min, double max ) {
		return (n >= min && n < max) ? n : (mod( n - min, max - min ) + min);
	}

	/**
	 * Returns the non-negative remainder of x / m.
	 * @param x The operand.
	 * @param m The modulus.
	 */
	static double mod( double x, double m ) {
		return ((x % m) + m) % m;
	}

}