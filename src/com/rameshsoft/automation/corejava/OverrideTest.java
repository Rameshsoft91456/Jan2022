package com.rameshsoft.automation.corejava;

class OverOne
{
    int a = 456;
	
	public void job() {
		System.out.println("PC: JOB");
	}
	
	public void salary() {
		System.out.println("PC: SALARY");
	}
	
	public void practice() {
		System.out.println("PC: PRACTICE");
	}
}

class OverTwo extends OverOne
{
	public void practice() {
		System.out.println("CC: I DONT DO PRACTICE");
	}
	
	public void enjoyment() {
		System.out.println("CC: ENJOYMENT IS MUST");
	}
	
}

public class OverrideTest {
public static void main(String[] args) {
	
	/*
	 * OverOne one = new OverOne(); one.salary(); one.job(); one.practice();
	 */
	
	/*
	 * OverTwo two = new OverTwo(); two.job(); two.salary(); two.practice();
	 * two.enjoyment();
	 */
	
	OverOne one = new OverTwo();
	one.salary();
	one.job();
	one.practice();
	
	
	
	
	
	
	
	
}
}
