package com.rameshsoft.automation.corejava;

abstract interface HumanLife
{
	String name = "Human Life"; //public static final
	
	void child(); //public abstract
	void education();
	public abstract void job();//
	public void family();
	public static void marriage()
	{
		System.out.println("MARRIAGE = GOD GIFT");
	}
	
	default double hike()
	{
		System.out.println("DEFAULT: HIKE");
		return 25000000.0;
	}
	/*
	 * private void hello1() { System.out.println("HELLO1"); } private static void
	 * hello2() { System.out.println("HELLO2"); }
	 */
}

abstract class HumanLifeImpl implements HumanLife
{
	@Override
	public double hike()
	{
		System.out.println("CUSTOM: HIKE");
		return 25000000.0;
	}
	@Override
	public void child() {
		System.out.println("CHILD");
	}
	@Override
	public void education() {
		System.out.println("EDUCATION");
	}
	@Override
	public void job() {
		System.out.println("JOB");
	}
	public void hello() {
		System.out.println("SOFTWARE = APPLYING COMMON SENSE");
	}
}

class HumanLifeImplOne extends HumanLifeImpl
{
	@Override
	public void family() {
		System.out.println("FAMILY");
	}
	
	public void entirment() {
		System.out.println("IT IS MANDATORY");
	}
}

public interface InterfaceTest {
public static void main(String[] args) {
	
	
	//HumanLife humanLife = new HumanLife();
	
	//HumanLifeImpl humanLifeImpl = new HumanLifeImpl();
	
	/*
	 * HumanLifeImplOne humanLifeImplOne = new HumanLifeImplOne();
	 * humanLifeImplOne.child(); humanLifeImplOne.education();
	 * humanLifeImplOne.entirment(); humanLifeImplOne.family();
	 * humanLifeImplOne.hello(); humanLifeImplOne.job(); String nameResp =
	 * humanLifeImplOne.name; System.out.println(nameResp);
	 * 
	 * System.out.println(HumanLife.name);
	 * 
	 */
	/*
	 * HumanLifeImpl humanLifeImpl = new HumanLifeImplOne(); humanLifeImpl.child();
	 * humanLifeImpl.education(); //humanLifeImpl.entirment();
	 * humanLifeImpl.family(); humanLifeImpl.hello(); humanLifeImpl.job();
	 * System.out.println(HumanLife.name);
	 * 
	 */
	HumanLife humanLife = new HumanLifeImplOne();
	humanLife.child();
	humanLife.education();
	//humanLife.entirment();
	humanLife.family();
	//humanLife.hello();
	humanLife.job();
	System.out.println(HumanLife.name);
	//humanLife.marriage();
	
	HumanLife.marriage();
	//HumanLife.hike();
	
	humanLife.hike();
	
}
}
