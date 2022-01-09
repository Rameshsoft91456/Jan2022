package com.rameshsoft.automation.corejava;

public class OverloadDemo {
	
	public int addition(int num1,int num2) {
		int result = num1 + num2;
		System.out.println("int int Result is: "+result);
		return result;
	}
	public float addition(float num1,float num2) {
		float result = num1 + num2;
		System.out.println("float float Result is: "+result);
		return result;
	}
	public double addition(double num1,double num2) {
		double result = num1 + num2;
		System.out.println("double double Result is: "+result);
		return result;
	}
	
public static void main(String[] args) {
	OverloadDemo demo = new OverloadDemo();
	demo.addition(25,65);
	demo.addition(250.0, 650.0);
	demo.addition(125.f, 225.f);
	demo.addition(500, 400);
	demo.addition('a', 'b');
	
}
}
