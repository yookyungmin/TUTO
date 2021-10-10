package test;

public class Star9 {

	public static void main(String[] args) {
		
			
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*
•j의 반복 횟수(별의 개수)를 i가 하나씩 늘어남에 따라 줄어들어야 한다.
•i = 0일 때, j는 5번 반복
•i = 1일 때, j는 4번(5-1) 반복
•i = 2일 때, j는 3번(5-2) 반복
•...
•i = i일 때, j는 (5-i) 반복
*/