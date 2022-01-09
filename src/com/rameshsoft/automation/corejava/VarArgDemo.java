package com.rameshsoft.automation.corejava;

public class VarArgDemo {

	public void login(String... string) {
		System.out.println("Var Arg Parameter");
	}
	
	public void login(String string) {
		System.out.println("Normal Method");
	}
	
	public void login(double... string) {
		System.out.println("Double Normal Method");
	}
	
	public static void main(String[] args) {
		VarArgDemo demo = new VarArgDemo();
		demo.login(90);
		//demo.login("java");
		//demo.login("java","selenium");
		//demo.login();
	}
}

