package javafundamentals;

import java.util.Scanner;
public class SwitchStatements {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input Month: ");
		int month = s.nextInt();
		System.out.print("Input Date: ");
		int Date = s.nextInt();
		System.out.print("Input Year: ");
		int Year = s.nextInt();
		
		if(Date > 31) {
			System.out.println("Invalid date");
		}else if(Date < 1) {
			System.out.println("Invalid date");	
		
		}
		
		
		switch(month) {
			
		case 1:
			System.out.println("January " + Date + ","+ Year);
			break;
		case 2:
			System.out.println("February " + Date + ","+ Year);
			break;
		case 3:
			System.out.println("March " + Date + ","+ Year);
			break;
		default:
			System.out.println("Invalid Month");
		}
		
		
		
		
		}

}
