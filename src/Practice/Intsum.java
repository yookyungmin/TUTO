package Practice;

import java.util.Scanner;
//0~999 입력 값중 자릿수 합을 구하라
public class Intsum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~999 사이의 숫자를 입력");
		int num =sc.nextInt();
		
		int a = num%10;//1의 자리
		int b= (num%100)/10; //10의 자리
		int c = (num%1000)/100; //100의자리

		int total =a+b+c;
		
		System.out.println("각자릿수의합"+total);
	}

}
