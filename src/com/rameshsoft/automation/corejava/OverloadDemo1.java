package com.rameshsoft.automation.corejava;

class OverloadTest1
{
	
	public float addition(float num1 , float num2) {
		float result = num1 + num2;
		System.out.println("float float Result is: "+result);
		return result;
	}
	
}

public class OverloadDemo1 {
	
	int id = 91456;
	
public static void main(String[] args) {
	OverloadTest1 test = new OverloadTest1();
	
	OverloadDemo1 demo = new OverloadDemo1();
	System.out.println(demo.id);
	
	
	/*
	 * test.addition(25,65); test.addition(25.50f, 45.50f); test.addition(50.0,
	 * 250.0);
	 */
	//test.addition(250.0, 250.50);  a = 97 b = 98 c = 99 ....
	
}
}
