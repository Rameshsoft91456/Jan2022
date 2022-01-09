package com.rameshsoft.automation.corejava;

class EncapsulationTest
{
	private int practHrs = 9;
	private String result = "JOB";
	
	
	public void hello() {
		System.out.println(practHrs+" ************ "+result);
	}
	
	public int getPractHrs() {
		return practHrs;
	}
	
	public String getResult() {
		return result;
	}
	
}

public class EncapsulationDemo {
public static void main(String[] args) {
	
	System.out.println();
	
	EncapsulationTest test = new EncapsulationTest();
	//test.practHrs = 0;
	//test.result = "BUDIDHA";
	test.hello();
	System.out.println(test.getPractHrs());
	System.out.println(test.getResult());
}
}

