package com.rameshsoft.automation.corejava;

class ObjectDemo1
{
	int id;
	String result;
	
	public void hello() {
		System.out.println(id+" ********** "+result);
	}
}

public class ObjectDemo {
public static void main(String[] args) {
	
	ObjectDemo1 demo1 = new ObjectDemo1();
	demo1.id = 91456;
	demo1.result = "JOB";
	demo1.hello();
	
	ObjectDemo1 demo2 = new ObjectDemo1();
	demo2.id = 456;
	demo2.result = "JOB IS MANDATORY";
	demo2.hello();
}
}


