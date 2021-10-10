package Practice;

import java.util.Scanner;

public class TESTSCORE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0; //총합 저장함수
		
		int number = sc.nextInt();
		String name = sc.nextLine();
		
		int age = sc.nextInt();
		int kor = sc.nextInt();
		int math= sc.nextInt();
		int eng = sc.nextInt();
		
	
	
		System.out.println("이름:["+name+"] 나이 :["+age+"세]"+name+ age);
		System.out.println("학년:["++"] 나이 :["+age+"]"+name+ age);
		System.out.println("이름:["+name+"] 나이 :["+age+"]"+name+ age);
		
		

	}

}

//사용 자로부터 
//번호 이름 국어 영어 수학 점수 순으로 입력 받아서
//다음과 같은 형식으로 출력되는 프로그램을 작성하시오
/*
이름 : [ ***]  나이 : [0**]세
학년 :  *학년  반: *반
국어 : [0**] 점  영어 : [0**] 점  수학 : [0**] 점
총점 : [0**] 점  평균 : [0**] 점*/