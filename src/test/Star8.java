package test;

public class Star8 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
		
			}
				System.out.println();
		}

	}

}
/*
 * 본격 별찍기 시작이다. 1~7까지 순서대로 차근차근 잘 이해하면서 풀었으면 충분히 풀 수 있는 문제다.
•Line 10 - 세로줄은 5줄이니 여전히 코드 동일
•i = 0일 때 j는 1번 반복한다. (별 하나)
•i = 1일 때 j는 2번 반복한다. (별 두 개)
•i =2일 때 j는 3번 반복한다. (별 세 개)
•i = i일 때 j는 i+1번 반복한다.
•Line 11 - 그러므로 j는 0부터 i번까지 반복한다.
*
 */