package Problem3;

//문자열을 숫자로 변환시 진수를 지정해서 출력해보시오
//이문제는 문자열을 숫자로 Integer.parsInt() 두번째 인자값으로 진수를 지정하여 출력하는것에대해 무든ㄴ것
//
public class Java100class {
		public static void main(String[] args) {
			
			
			//[1] 숫자끼리 연산
			int a=1;
			int b=2;
			int c = a+b;
			System.out.println("a+b=+c"); //3
			
			//문자열끼리 연산
			String a1="1";
			String b1 = "2";
			String c1=a1+b1;
			System.out.println("a1+b1 = "+c1); //12
			System.out.println(c1.getClass().getName());  //getClass = 메타 속성정보 getName = 패키지명이 포함된 클래스명 java.lang.String
			
			//진수지정
			System.out.println("================진수지정");
			System.out.println(Integer.parseInt("2022"));//222
			System.out.println(Integer.parseInt("2022", 10)); //2022
			System.out.println(Integer.parseInt("1",2)); //9  //2진수
			System.out.println(Integer.parseInt("1001",2)); //2진수
			System.out.println(Integer.parseInt("1004",8)); //8진수
		}
		
}
