package javafundamentals;

public class TwoDarray {

	public static void main(String[] args) {
		
		String[][] users = {
				{"Dvid","david","ewan"},
				{"Alenere","alenere"},
				{"Hezel","hezel","John"},
				{"Jaymar","jaymar","Jupiter"}
		};
		
		
		
		
//		for(int row = 0; row<user.length ;row++) {
//				
//			for(int col = 0; col < user[row].length;col++) {
//				System.out.println(user[row][col]);
//			}
//			
//			System.out.println();
//		
//		
//		}
		
		for(String user[]:users) {
			
			for(String info:user) {
				System.out.println(info);
			}
			
			System.out.println();
		}
		
		
	}

}
