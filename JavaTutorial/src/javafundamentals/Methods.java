package javafundamentals;

public class Methods {

	
	
	public static void main(String[] args) {
		
		
		int number[] = {1,2,3,4,5};
		
		int result = summation(number);
		System.out.println(result);

	}
	
	
	static int summation(int number[] ) {
		int sum = 0;
		
		for(int num:number) {
			sum = sum + num;
		}
		
		return sum ;
	}

}
