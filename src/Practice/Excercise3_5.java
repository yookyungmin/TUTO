package Practice;

import java.util.Scanner;

public class Excercise3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt(); // 입력값 I 
		
		String AB = (i>0) ? "양수" : "음수";  // i > 0보다 크면 양수 작으면 음수
			
		
		
		System.out.println(i+ " = " + AB);
		

	}

}
