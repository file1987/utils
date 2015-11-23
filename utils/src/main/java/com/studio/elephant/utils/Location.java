package com.studio.elephant.utils;

public class Location {
	public double lat;
	public double lng;
	
	private Location(double lat, double lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}

	public static Location newInstance(double lat, double lng) {
		return new Location(lat, lng);
	}
	

}
