package com.studio.elephant.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.log4j.Logger;
/**
 * 
 * @author file
 * @since 2015-1-13 下午9:30:20
 * @version 1.0
 */
public class MD5Util {
	
	private static final Logger logger = Logger.getLogger(MD5Util.class);
	
	public static String md5(String str){
		
		MessageDigest messageDigest = null;  
        try {  
            messageDigest = MessageDigest.getInstance("MD5");  
            messageDigest.reset();  
            messageDigest.update(str.getBytes("UTF-8"));  
        } catch (NoSuchAlgorithmException e) {  
        	logger.error("", e);
           return str;
        } catch (UnsupportedEncodingException e) {  
        	logger.error("", e);
           return str;
        }  
        byte[] byteArray = messageDigest.digest();  
        StringBuffer md5StrBuff = new StringBuffer();  
        for (int i = 0; i < byteArray.length; i++) {              
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)  
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));  
            else  
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));  
        }    
        return md5StrBuff.toString();  
	}

}
