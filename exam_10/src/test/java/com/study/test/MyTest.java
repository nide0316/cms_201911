/**
 * 
 */
package com.study.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.study.utils.DateUtil;

/**
 * @author：阿宁
 *
 * 2019年12月11日
 */
public class MyTest {

	//根据传入的日期获取年龄
	@Test
	public void getAge() {
		String str = "2000-10-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date parse = sdf.parse(str);
			Calendar instance = Calendar.getInstance();
			instance.setTime(parse);
			int age = DateUtil.getAge(instance);
			System.out.println("当前年龄为:" + age + "周岁");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//根据传入的参数获取该日期的月初日期
	@Test
	public void setInitDate() {
		String str = "2019-09-10 12:29:38";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date parse = sdf.parse(str);
			Calendar instance = Calendar.getInstance();
			instance.setTime(parse);
			Calendar time = DateUtil.initDateTime(instance);
			Date time2 = time.getTime();
			String format = sdf.format(time2);
			System.out.println("给定日期的月初日期为:" + format);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//根据传入的参数获取该日器的月末日期
	@Test
	public void setLastDate() {
		String str = "2019-09-10 12:29:38";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date parse = sdf.parse(str);
			Calendar instance = Calendar.getInstance();
			instance.setTime(parse);
			Calendar lastDay = DateUtil.initLastDay(instance);
			Date time = lastDay.getTime();
			String format = sdf.format(time);
			System.out.println(format);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//求未来日期离今天还剩的天数
	@Test
	public void FutrueDay() {
		String str = "2020-01-13";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date parse = sdf.parse(str);
			Calendar instance = Calendar.getInstance();
			instance.setTime(parse);
			int futrueDay = DateUtil.getFutrueDay(instance);
			System.out.println(str + "距离今天还有" + futrueDay +"天");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//求过去日期离今天过去的天数
	@Test
	public void getPassDay() {
		String str = "2019-06-05";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date parse = sdf.parse(str);
			Calendar instance = Calendar.getInstance();
			instance.setTime(parse);
			int passDay = DateUtil.getPassDay(instance);
			System.out.println(str + "到今天已经过去" + passDay +"天");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
