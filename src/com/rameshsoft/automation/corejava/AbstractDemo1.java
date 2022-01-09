package com.rameshsoft.automation.corejava;

abstract class AbsDemo
{
	static int practHrs = 9;
	static String result = "JOB";
	
	static public void hello() {
		System.out.println(practHrs+" ********* "+result);
	}
	
}

public class AbstractDemo1{
	
public static void main(String[] args) {

	//AbsDemo demo = new AbsDemo();
	AbsDemo.hello();
}
}
