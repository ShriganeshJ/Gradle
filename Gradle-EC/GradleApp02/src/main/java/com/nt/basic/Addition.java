package com.nt.basic;

import org.joda.time.LocalDate;

public class Addition
{
	public int sum (int a , int b)
	{
		return a+b;
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Welcome to gradle--> java");
		Addition a = new Addition();
		System.out.println("Result is ::"+a.sum(10,20));
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC driver loaded.....");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		LocalDate localTime = new LocalDate();
		System.out.println(localTime);
		
		
	}
	
	
}