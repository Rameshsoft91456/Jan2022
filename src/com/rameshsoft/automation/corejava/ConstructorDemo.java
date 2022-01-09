package com.rameshsoft.automation.corejava;

public class ConstructorDemo {
	
	int salary;
	String hardwork;
	
	public ConstructorDemo(int salary,String hardwork)
	{
		this.salary = salary;
		this.hardwork = hardwork;
		//System.out.println(salary+" ********** "+hardwork);
	}

	public void hello() {
		System.out.println(salary+" ********** "+hardwork);
	}
public static void main(String[] args) {
	
	
	ConstructorDemo demo = new ConstructorDemo(125000,"JAVA");
	demo.hello();

}
}
