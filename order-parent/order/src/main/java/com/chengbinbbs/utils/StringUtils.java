package com.chengbinbbs.utils;

import net.sf.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 字符串常规工具
 * @author kouyi
 */
public class StringUtils {

	public static SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 转换为字节数组
	 * @param str
	 * @return
	 */
	public static byte[] getBytes(String str){
		if (str != null){
			try {
				return str.getBytes("UTF-8");
			} catch (UnsupportedEncodingException e) {
				return null;
			}
		}else{
			return null;
		}
	}

	/**
	 * 转换为字节数组
	 * @param bytes
	 * @return
	 */
	public static String toString(byte[] bytes){
		try {
			return new String(bytes, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	public static boolean isEmpty(Object value) {
		return (value == null || "".equals(value));
	}

	public static boolean isEmpty(Object[] values) {
		return (values == null || values.length == 0);
	}

	public static boolean isNotEmpty(Object value) {
		return (!isEmpty(value));
	}

	public static String getUUID() {
		String uuid = UUID.randomUUID().toString();
		return uuid.toUpperCase().replace("-", "");
	}

	public static String getJsonString(Object value) {
		if(value != null) {
			return JSONObject.fromObject(value).toString();
		}
		return null;
	}

	public static boolean isEmpty(String str) {
		if (str == null)
			return true;
		return "".equals(str.trim());
	}

	public static boolean isEmpty(Collection<?> value) {
		return (value == null || value.size() == 0);
	}

	public static boolean isEmpty(Map<?,?> value) {
		return (value == null || value.size() == 0);
	}

	public static boolean isEmpty(String[] value) {
		return (value == null || value.length == 0);
	}

	public static String[] split(String str1, String str2) {
		return org.apache.commons.lang.StringUtils.split(str1, str2);
	}

	/**
	 * <br>
	 * <b>功能：</b>将字符串转成list<br>
	 * <b>作者：</b>www.jeecg.org<br>
	 * <b>日期：</b> Oct 28, 2013 <br>
	 *
	 * @param exp 分割符 如","
	 * @param value
	 * @return
	 */
	public static List<String> StringToList(String value, String exp) {
		List<String> resultList = new ArrayList<String>();
		String[] vals = split(value, exp);
		for (String val : vals) {
			resultList.add(val);
		}
		return resultList;
	}

	/**
	 * <br>
	 * <b>功能：</b>数字转换成字符串<br>
	 * <b>作者：</b>www.jeecg.org<br>
	 * <b>日期：</b> Jul 30, 2013 <br>
	 *
	 * @param arrs
	 * @return
	 */
	public static String arrayToString(String[] arrs) {
		StringBuffer result = new StringBuffer("");
		if (arrs != null && arrs.length > 0) {
			for (int i = 0; i < arrs.length; i++) {

				if (!result.toString().equals("")) {
					result.append(",");
				}
				if (arrs[i] != null && !"".equals(arrs[i].trim())) {
					result.append(arrs[i]);
				}
			}
		}
		return result.toString();
	}

	/**
	 * <br>
	 * <b>功能：</b>数字转换成字符串<br>
	 * <b>作者：</b>www.jeecg.org<br>
	 * <b>日期：</b> Jul 30, 2013 <br>
	 *
	 * @param arrs
	 * @return
	 */
	public static String arrayToString(Object[] arrs) {
		StringBuffer result = new StringBuffer("");
		if (arrs != null && arrs.length > 0) {
			for (int i = 0; i < arrs.length; i++) {

				if (!result.toString().equals("")) {
					result.append(",");
				}
				if (arrs[i] != null && !"".equals(arrs[i].toString().trim())) {
					result.append(arrs[i]);
				}
			}
		}
		return result.toString();
	}

	public static String left(String str, int length) {
		return org.apache.commons.lang.StringUtils.left(str, length);
	}

	public static String getMD5(String source) {
		if (source == null || source == "") {
			return null;
		}
		String str = null;
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			java.security.MessageDigest md = java.security.MessageDigest
					.getInstance("MD5");
			md.update(source.getBytes());
			byte tmp[] = md.digest();
			char chstr[] = new char[16 * 2];
			int k = 0;
			for (int i = 0; i < 16; i++) {
				byte byte0 = tmp[i];
				chstr[k++] = hexDigits[byte0 >>> 4 & 0xf];
				chstr[k++] = hexDigits[byte0 & 0xf];
			}
			str = new String(chstr);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return str;
	}

	public static String parseString(Object obj) {
		return obj == null ? null : obj.toString();
	}
}

