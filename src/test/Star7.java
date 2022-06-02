package test;

public class Star7 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=5; j<10; j++) {
				System.out.print(j-i);
			}
			System.out.println();
		}

	}

}
/*Q.6을 참고하여 문제를 풀어야 한다. 생각을 조금 더 해야 하는 문제. (수업시간에 이 부분에서 막힌 사람이 꽤 보였다.)
•Line 10 - 항상 5줄이므로 코드 동일
•Line 11 - j도 똑같이 5번을 반복하지만 시작 값을 5로 조금 달리해야 한다. 점점 줄어드는 방식. •i = 0이고 j가 5,6,7,8,9 총 5번 반복할 때, 56789 출력 // System.out.print(j)
•i = 1이고 j가 5,6,7,8,9 총 5번 반복할 때, 45678 출력 // System.out.print(j-1)
•i = 2이고 j가 5,6,7,8,9 총 5번 반복할 때, 34567 출력 // System.out.print(j-2)
•...
•...
•즉, 각 줄마다 (j-i)를 출력한다



*/