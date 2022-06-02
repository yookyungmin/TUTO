package test;
public class Star4{
	public static void main(String[] args){
	
	System.out.println("Q4");
	for(int i =0; i<=5; i++){ //  세로줄 행을 나타내는 반복문 i가 1~5까지 총 5번반복
	for(int j=0; j<5;j++){// 가로줄을나타내는반복문 i번째 세로줄일대 iiiii가 출력
	System.out.print(i); //순서 i=1이고 j=0~4까지 총 5번 1번을 반복 출력, 11111
}
	System.out.println();
}
	}
		
		
//		for(int i=0; i<5; i++) {
//			for(int j= 0; j<5; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//	}
}

/*
 * 
 * •Line 10 - 세로줄을 나타내는 반복문이다. 5줄이 있으니 i가 1~5까지 총 5번을 반복.
•Line 11 - 가로줄을 나타내는 반복문이다. i번째 세로줄일 때 iiiii가 출력된다. •순서
•i = 1이고 j = 0~4까지 총 5번 1을 반복 출력한다. 11111 // (System.out.print(1) x5
•Line 14 - 한 줄 띄워준다.
•i = 2이고 j = 0~4까지 총 5번 2를 출력한다. 22222 // System.out.print(2) x5
•Line 14 - 한 줄 띄워준다.
•...
•...

11111
22222
33333
44444
55555

 */
