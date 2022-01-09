package com.rameshsoft.automation.corejava;

class Demo2
{
	public void hello() {
		System.out.println("hello()");
	}
}


public class ConstructorDemo1 extends Demo2{
	int salary;
	String hardwork;
	
	public ConstructorDemo1(int sal,String hard)
	{
		this.salary = sal;
		this.hardwork = hard;
		//System.out.println(salary+" ********** "+hardwork);
		this.hello();
		super.hello();
		hello();
	}

	public ConstructorDemo1()
	{
		System.out.println("default constructor");
	}
	
	public ConstructorDemo1(int a)
	{
		System.out.println("1 int constructor");
	}
	public void hello() {
		System.out.println(this.salary+" ********** "+this.hardwork);
	}
public static void main(String[] args) {
	
	ConstructorDemo1 demo = new ConstructorDemo1(125000,"JAVA");
	demo.hello();

	ConstructorDemo1 demo1 = new ConstructorDemo1('d');
}
}
