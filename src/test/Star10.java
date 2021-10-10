package test;

public class Star10 {

		public static void main(String[] args) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<i; j++) {
					System.out.print(" "); //공백을 담당하는 for 문
//					System.out.print(j);
				}
				for(int j=0; j<5-i; j++) {
					System.out.print("*"); //별을 담당하는 for문
				}
				
				System.out.println();
			}
		}
}
