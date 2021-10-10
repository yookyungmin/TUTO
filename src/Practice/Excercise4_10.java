package Practice;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
public class Excercise4_10 {

	public static void main(String[] args) {
		
		int answer=(int)(Math.random()*100)+1; // 1~101		
		int input =0; // 사용자 입력을 저장할값 입력값
		int count = 0; //시도횟수
			
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { count++;
			System.out.print("1과 100사이의 값을 입력하세요");
			input = sc.nextInt(); //입력받은값을 input에저장
			
			if(input<answer) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(input>answer) {
				System.out.println("더 작은 수를 입력하세요");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는"+count+"번입니다.");
				break;//do while문을 벗어난다.
				//continue; // 반복
			}
			
			
			
			
			
			
			
		} 
		
				
				

	} //end of main

} //end of class Highlow
