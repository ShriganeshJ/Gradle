package com.nt.basic;


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
		
	}
	
	
}