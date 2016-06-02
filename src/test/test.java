package test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date date = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		System.out.println(date);
		System.out.println(new Date(date.getTime()));
		System.out.println(sdf.format(date));
	}

}
