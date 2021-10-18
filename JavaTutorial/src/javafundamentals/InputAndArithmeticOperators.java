package javafundamentals;

import java.util.Scanner;

public class InputAndArithmeticOperators {

	public static void main(String[] args) {
		
//		String x;
//		int age;
//		
		
		Scanner scan = new Scanner(System.in);
		
		float num1;
		float num2;
		float result;
//		
//		
//		System.out.print("Enter your name?: ");
//		x = scan.nextLine();
//		System.out.print("Enter your age?: ");
//		age = scan.nextInt();
//		
//		
//		System.out.println("You are " + x);
//		System.out.println("You are " + age +" years old");
		
		System.out.print("Input num1: ");
		num1 = scan.nextInt();
		System.out.print("Input num2: ");
		num2 = scan.nextInt();
		
		result = num1 + num2;
		
		System.out.println(num1 + "+" + num2 + "=" + result );
	}

}
