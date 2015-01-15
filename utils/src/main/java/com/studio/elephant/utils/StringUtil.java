package com.studio.elephant.utils;

import java.util.regex.Pattern;
/**
 * String 工具类
 * @author file
 * @since 2015-1-12 下午5:47:56
 * @version 1.0
 */
public final class StringUtil {
	//数字正则表达式
	private static final  String  IS_NUMBER_EXP ="\\d+(\\.\\d+)?"; 
	/**
	 * 字符串是否为空（null或""）
	 * @param str 字符串
	 * @return 
	 */
	public static boolean isEmpty(final String str){
		return null==str||"".equals(str);
	}
	/**
	 * 字符串是否为空,忽略前后的空格
	 * @param str 字符串
	 * @return
	 */
	public static boolean isEmptyIgnoreBlank(final String str){
		return null==str||"".equals(str.trim());
	}
	/**
	 * 字符串是否可以转为数字
	 * @param str 字符串
	 * @return
	 */
	public static boolean isNumber(final String str){
		if(isEmptyIgnoreBlank(str))
			return false;
		return Pattern.matches(IS_NUMBER_EXP, str.trim());
	}
	/**
	 * 字符串是否相等，忽略前后空格
	 * @param str1     字符串1
	 * @param str2     字符串2
	 * @return
	 */
	public static boolean isEqualsIgnoreBABlank(final String str1,final String str2){
		if(str1==null&&str2==null)
			return true;
		else if(str1==null)
			return false;
		else if(str2==null)
			return false;
		else
			return str1.trim().equals(str2.trim());
	}
	/**
	 * 字符串是否相等
	 * @param str1     字符串1
	 * @param str2     字符串2
	 * @return
	 */
	public static boolean isEquals(final String str1,final String str2){
		if(str1==null&&str2==null)
			return true;
		else if(str1==null)
			return false;
		else if(str2==null)
			return false;
		else
			return str1.equals(str2);
	}
	
	/**
	 * 获取字符串的长度
	 * @param str 字符串
	 * @return
	 */
	public static int len(final String str){
		if(isEmpty(str))
			return 0;
		return str.length();
	}
	
	/**
	 * 去除字符串前后空格
	 * @param str 字符串
	 * @return
	 */
	public static String trim(final String str){
		if(str==null)
			return null;
		return str.trim();
	}
	/**
	 * 字符串转成int
	 * @param str 
	 * @return
	 */
	public static Integer toInt(final String str){
		if(isNumber(str))
			return Double.valueOf(str).intValue();
		return null;
	}
	/**
	 * 字符串转成long
	 * @param str
	 * @return
	 */
	public static Long toLong(final String str){
		if(isNumber(str))
			return Double.valueOf(str).longValue();
		return null;
	}
	/**
	 * 字符串转成double
	 * @param str
	 * @return
	 */
	public static Double toDouble(final String str){
		if(isNumber(str))
			return Double.valueOf(str);
		return null;
	}
	/**
	 * 字符串转成float
	 * @param str
	 * @return
	 */
	public static Float toFloat(final String str){
		if(isNumber(str))
			return Float.valueOf(str);
		return null;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(toInt("  1.00000  "));
	}
	
	
	
}
