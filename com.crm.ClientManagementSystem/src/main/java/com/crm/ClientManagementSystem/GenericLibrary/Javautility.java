package com.crm.ClientManagementSystem.GenericLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Javautility {
	
	public String getDateAndTime(String pattern ) {
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;
	}
	
	public int generateRandom(int bound) {
		Random r=new Random();
		int data = r.nextInt(bound);
		return data;
	}
	

}
