package javafundamentals;

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
//		String[] names = {"David", "Alener", "Ace", "Jasfer", "Patrick"};
		int[] numbers = {1,2,3,4,5,6,7,8};
		
		
//		System.out.print("Input Name: ");
//		String name = s.nextLine();
		int sum = 0;
		
		for(int num: numbers) {
			sum = sum + num;
			
		}
		
		System.out.println(sum);
	}

}
