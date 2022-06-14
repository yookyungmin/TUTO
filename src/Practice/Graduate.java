package Practice;

import java.util.Scanner;

import practicc2.if_1;

public class Graduate {
// 대학 졸업하려면 최소 140학점
	//이수한학점중 전공은 70학점이상
	//교양과 일반은 각각 30점 이상이거나 
	//두영역 합이 80학점이상
	//학점 세개 키보드로 입력받아 졸업여부 체크
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("전공이수 학점");
		double a = sc.nextDouble();
		
		System.out.println("교양이수 학점");
		Double b = sc.nextDouble();
		
		System.out.println("일반이수 학점");
		Double c= sc.nextDouble();
		
		Double total = a+b+c; // 토탈점수 
		if(total>140&&(a>70&&((b>30&&c>30)||(b+c>80)))) {
			System.out.println("졸업 가능");
		}else {
			System.out.println("졸업불가");
		}

	}

}
