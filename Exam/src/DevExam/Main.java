package DevExam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		int C = 0;
		int i = 0;
		
		while(i<5) {
			System.out.print("Input number A: ");
			int A = s.nextInt();
			
			System.out.print("Input number B: ");
			int B = s.nextInt();
			

				if(A>B) {
					C = A - B + 5;
					System.out.print(C);
				}else if(A<B) {
					A = B;
					C = A + B;
					System.out.print(C);
				}
				i++;
		}
		
		
			
		
	}

}
