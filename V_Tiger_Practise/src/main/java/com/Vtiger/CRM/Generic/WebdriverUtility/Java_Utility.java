package com.Vtiger.CRM.Generic.WebdriverUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Java_Utility {

	public int getRandomNum()
	{
		Random rn = new Random();
		int random = rn.nextInt(3000);
		return random;
	}
	
	public String getCurrentDate()
	{
		Date d = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		String cd = sim.format(d);
		return cd;
	
	}
	
	public String getrequiredDate(int days)
	{
		Date d = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		sim.format(d);
		Calendar cal =  sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String ed = sim.format(cal.getTime());
		return ed;
	}
	
	
}
