package javafundamentals;

import java.util.Scanner;


public class ConditionalStatement {
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Enter grade :");
		int grade1 = s.nextInt();
		System.out.print("Enter grade :");
		int grade2 = s.nextInt();
		System.out.print("Enter grade :");
		int grade3 = s.nextInt();
		System.out.print("Enter grade :");
		int grade4 = s.nextInt();
		
		
		int average = ((grade1 + grade2 + grade3 + grade4) / 4);  
	
		
		
		
//		if(age >= 18) {
//			System.out.println("You have acces "); 
//		}else if(age >= 13) {
//			System.out.println("You need parent consent");
//		}else {
//			System.out.println("You are a kid");
//		}d
		
		
		if (average == 100) {
			System.out.println("Average: " + average );
			System.out.print("Invalid Grade");
		}else if (average >= 98) {
			System.out.println("Average: " + average );
			System.out.print("With Highest Honors");
		}else if (average >= 95){
			System.out.println("Average: " + average );
			System.out.print("You have no acces");
		}else if (average >=90) {
			System.out.println("Average: " + average );
			System.out.print("With Honors");
		}else if (average >=75) {
			System.out.println("Average: " + average );
			System.out.print("Passed");	
		}else {
			System.out.println("Average: " + average );
			System.out.print("Failed");	
		}
		
	}
}
