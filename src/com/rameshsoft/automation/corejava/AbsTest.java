package com.rameshsoft.automation.corejava;

abstract class AbsDemo12
{
	public void hello() {
		System.out.println("BABU DON'T SLEEP");
	}
	
	abstract public void ifYouDontDoPractice();
	public abstract void job();
	
}

abstract class AbsDemo1 extends AbsDemo12
{
	@Override
	public void ifYouDontDoPractice() {
		System.out.println("PLZ DO PRACTICE");
	}
	public void hike() {
		System.out.println("HIKE");
	}
	
}
class AbsDemo2 extends AbsDemo1
{
	@Override
	public void job() {
		System.out.println("JOB");
	}
	public void proActive() {
		System.out.println("PROACTIVE = HIKE");
	}
}
public class AbsTest {
public static void main(String[] args) {
	
	//AbsDemo demo = new AbsDemo();
	//AbsDemo1 demo1 = new AbsDemo1();
	AbsDemo2 demo2 = new AbsDemo2();
	demo2.hello();
	demo2.hike();
	demo2.ifYouDontDoPractice();
	demo2.job();
	demo2.proActive();
	
	AbsDemo1 demo1 = new AbsDemo2();
	
	
}
}

