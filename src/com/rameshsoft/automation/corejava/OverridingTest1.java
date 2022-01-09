package com.rameshsoft.automation.corejava;

class OverOne1
{
	final int practHrs = 9;
	
	public void education() {
		//practHrs = 5;
		System.out.println("PC: EDUCATION");
	}
	public void enjoyment() {
		System.out.println("PC: ENJOYMENT");
	}
	public void hardwork() {
		System.out.println("PC: HARDWORK");
	}
	public void job() {
		System.out.println("PC: JOB");
	}
}
class OverOne2 extends OverOne1
{
	public void education() {
		System.out.println("CC: I DON'T WANT EDUCATION");
	}
	@Override
	public void hardwork() {
		System.out.println("CC: I DON'T DO HARDWORK");
	}
	public void marriage() {
		System.out.println("MARRIAGE");
	}
}

public class OverridingTest1 {
public static void main(String[] args) {
	
	/*
	 * OverOne1 one1 = new OverOne1(); one1.education(); one1.enjoyment();
	 * one1.hardwork(); one1.job();
	 */
	
	/*
	 * OverOne2 one2 = new OverOne2(); one2.education(); one2.enjoyment();
	 * one2.hardwork(); one2.job(); one2.marriage();
	 */
	
	
	  OverOne1 one1 = new OverOne2(); 
	  one1.education(); 
	  one1.enjoyment();
	  one1.hardwork();
	  one1.job();
	  
	 
	
	
	
	
	
	
	
	
	
}
}
