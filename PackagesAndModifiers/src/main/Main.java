package main;

import mathematics.*;

public class Main {
	
	static String section = "A";

	public static void main(String[] args) {
		
		
		
		Arithmetic a = new Arithmetic();
		Constants c = new Constants();
		
		System.out.print(Constants.pi);
		
		
//		String section;
//		
//		sayHello();
//		a.add(3, 6);
//		sum(2,4);
//		
//		int num1 = 4;
//		int num2 = 2;
//		int result = add(num1,num2);
//		System.out.println(result);
		
		int sum = Arithmetic.add(5, 3);
		System.out.println(sum);
		
		
		
	}

	static void sayHello() {
		System.out.println("Hello");
	
	}
	
	static void sum(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		
		System.out.println(sum);
		
	}
	
	static int add(int num1, int num2) {
		int add = 0;
		add = num1 + num2;
		
		return add;
		
	}
}
