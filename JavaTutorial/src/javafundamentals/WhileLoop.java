package javafundamentals;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] names = {"David", "Alener", "Ace", "Jasfer", "Patrick"};
		
		
		
		
		int lives = 3;
		String ans = "";
		
		while (lives > 0 ) {
			
			System.out.println("Who is our legendary hero? " );
			System.out.print("Answer :");
			ans = s.nextLine();
			
			if(ans.equalsIgnoreCase("JoseRizal")) {
				System.out.print("You won!");
				break;
			}else {
				System.out.println("You Lost!");
				lives--;
			}
			
			
		}
		
		
		
		
		
//		int i = 0;
//		
//		while(i < names.length) {
//			
//			if(names[i].equalsIgnoreCase(name)) {
//				System.out.print("We found " + names[i]);
//				break;
//			}else {
//				System.out.println(names[i]);
//			}
//			i++;
//		}
		
		
		
	}

}
