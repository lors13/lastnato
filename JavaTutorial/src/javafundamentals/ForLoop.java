package javafundamentals;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] username = {"David", "Alener", "Ace", "Jasfer", "Patrick"};
		String[] password = {"David", "Alener", "Ace", "Jasfer", "Patrick"};
		
		System.out.print("Input Username: ");
		String user = s.nextLine();
		System.out.print("Input Password: ");
		String pass = s.nextLine();
		
		boolean isExist = false;
		
		for(int i = 0; i<username.length ;i++) {
			
			if(user.equalsIgnoreCase(username[i]) && pass.equalsIgnoreCase(password[i])) {
				isExist = true;
				break;
			}
			
		}
		
		if(isExist) System.out.println("Welcome " + user);
		else System.out.println("Account Not Found");	

	}

}
