package Problem3;

import java.util.Arrays;  //Arrays.toStirng 사용하기위해 

//2개의 정수형 값을 리턴하는메서드를 구현하시오 
public class Java100Methodrturn {
	
	public static int[] testMethod() {
		int num1= 100;
		int num2 = 200;
		int num3 = 300;
//		int[] num = {100, 200};
		return new int[] {num1, num2, num3}; // 배열로 반환해서 메소드명testMethod() 명앞도 배열 int[]로
	}
	
	public static void main(String[] args) {
		//[1] 배열변수 변수선언 메서드로부터 반환받을 값이 배열이기떄문
		int result[] = testMethod();

		//[2]출력
		System.out.println(result); //주소값출력
		System.out.println(result[0]+","+result[1]); // 인덱스별로 각가출력
		System.out.println(result[0]+result[1]); //300 연산
		System.out.println(Arrays.toString(result)); //모든값 출력 반복문 없이
		
		for(int i = 0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
