package javafundamentals;

import java.util.Scanner;

public class Arrays {

	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int index;
		String email[] = {"jhon@gmail.com", "lors@gmail.com"};
		String userName[] = {"lonemoon", "zhakin24"};
		String Password[] = {"1234", "5678"};
		
//		String studentNames[] = {"David","Alenere","Jaymar","Ace","Jasfer"};
//		studentNames[0] = "Emman";
//		int numbers[] = {1,2,3,4,5};
//		int add = 0;
//		add = numbers[0] + numbers[3];
//		System.out.println(add);
//		System.out.print(studentNames[0]);
		
		
		System.out.print("Enter Index: ");
		index = s.nextInt();	
		
		System.out.println("Email:" + email[index]);
		System.out.println("Username:" + userName[index]);
		System.out.println("Password:" + Password[index]);
		
	
		

		

	}

}
