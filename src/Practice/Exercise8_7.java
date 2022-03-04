package Practice;

import java.util.*;

public class Exercise8_7
{	
	public static void main(String[] args)
	{
	//1~100사이의 임의의값을 얻어서 answer 에 저장한다
	int answer=(int)(Math.random()*100)+1; // 1~100
	int input = 0; // 사용자 입력을 저장할 공간
	int count = 0; //시도 횟수를 세기 위한 변수
		Scanner sc = new Scanner(System.in);
	do {
		
	      count++;
	      System.out.println("1과 100사이의 값을 입력하세요");
	//input = new Scanner(System.in).nextInt();
	try{
		input = Integer.parseInt(sc.nextLine());
//	input = new Scanner(System.in).nextInt();
	} catch(Exception e) {
	System.out.println("유효하지 않은값입니다"+"다시 값을입력해주세요");
	continue;
	}
	if(answer > input){
	System.out.println("더큰수를 입력하세요");
	}
	else if(answer<input){
	System.out.println("더 작은수를 입력하세요");	
	}
	else {
	System.out.println("맞췄습니다");
	System.out.println("시도횟수는" +count +"번입니다");
	break; // do-while문을 벗어난다.
	}
	
}while(true); //무한반복문

}//end of main

}//endof class HighLow