package com.cts;
import com.cts.service.SomeService;

public class Main {
	public static void main(String args[])
	{
	System.out.println("welcome to the session");
	System.out.println("hi all ");
	
	SomeService ss=new SomeService();
	System.out.println(ss.findLength("program"));
	
}
}
