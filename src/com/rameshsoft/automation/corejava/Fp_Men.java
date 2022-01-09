package com.rameshsoft.automation.corejava;

class Fp_Menn {
	String name = "JOB";

	public void login() {
		;;;;;;;;// 20 lines of code
		System.out.println("LOGIN()");
	}

	public void logout() {
		System.out.println("LOGOUT()");
	}

	public void clothes() {
		System.out.println("CLOTHES()");
	}
}

class Fp_Women extends Fp_Menn {

	public void diamonds() {
		System.out.println("DIAMONDS()");
	}
}

class Fp_Kids extends Fp_Women {
	public void toys() {
		System.out.println("TOYS()");
	}
}

public class Fp_Men {
	public static void main(String[] args) {

		/*
		 * //1. creating parent class object Fp_Menn men = new Fp_Menn(); men.login();
		 * men.clothes(); men.logout(); //men.diamonds();
		 * 
		 * //2. creating child class object Fp_Women women = new Fp_Women();
		 * women.login(); women.clothes(); women.logout(); women.diamonds();
		 */
		
		/*
		 * //3. creating child class object using parent class reference Fp_Menn men =
		 * new Fp_Women(); men.login(); men.clothes(); men.login(); //men.diamonds();
		 */
		
		//4. creating parent class object using child class reference
		//Fp_Women women = new Fp_Menn();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
