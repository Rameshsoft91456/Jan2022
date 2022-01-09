package com.rameshsoft.automation.corejava;

import java.util.Scanner;

class ConsoleDemo1
{
	int id;
	String result;
	
	public void hello() {
		System.out.println(id+" ********* "+result);
	}
}

public class ConsoleDemo {
public static void main(String[] args) {
	
	ConsoleDemo1 demo1 = new ConsoleDemo1();
	
	
	System.out.println("Enter id: ");
	
	Scanner scanner = new Scanner(System.in);
	//int id1 = scanner.nextInt();
	
	demo1.id = scanner.nextInt();
	
	//demo1.id = id1;
	
	System.out.println("Enter the result: ");
	String result1 = scanner.next();
	demo1.result = result1;
	
	demo1.hello();
	
}
}
