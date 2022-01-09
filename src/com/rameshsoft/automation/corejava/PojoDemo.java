package com.rameshsoft.automation.corejava;

class PojoTest
{
	private int practHrs;
	private String result;
	
	
	public void setPractHrs(int demo)
	{
		practHrs = demo;
	}
	
	public void setResult(String demo)
	{
		result = demo;
	}
	
	public int getPractHrs()
	{
		return practHrs;
	}
	
	public String getResult()
	{
		return result;
	}
	
}

public class PojoDemo {
public static void main(String[] args) {
	
	PojoTest pojoTest = new PojoTest();
	
	pojoTest.setPractHrs(9);
	pojoTest.setResult("JOB IS IN UR HAND");
	
	int practHrsResp = pojoTest.getPractHrs();
	System.out.println(practHrsResp);
	
	String resultResp = pojoTest.getResult();
	System.out.println(resultResp);
	
	
	
}
}


