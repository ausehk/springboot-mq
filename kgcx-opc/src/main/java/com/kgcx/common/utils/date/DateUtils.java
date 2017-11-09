package com.kgcx.common.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * class_name: DateUtils
 * package: com.kgcx.common.utils.date
 * describe: TODO
 * creat_user: 何凯
 * creat_date: 2017/11/9
 * creat_time: 21:17
**/
public class DateUtils {
	private final static SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");

	private final static SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");

	private final static SimpleDateFormat sdfDays = new SimpleDateFormat("yyyyMMdd");

	private final static SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 字符串转化为时间格式（yyyy-MM-dd）
	 * @param date
	 * @return
	 */
	public static Date fomatDate(String date) {
		try {
			return sdfDay.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}
