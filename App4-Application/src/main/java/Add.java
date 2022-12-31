package com.js.mat;


public class Add
{
	public int sum (int a , int b)
	{
		return a+b;
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Welcome to gradle--> java");
		Add a = new Add();
		System.out.println("Result is ::"+a.sum(10,20));
		
	}
	
	
}