package test;

public class Star6 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i+j);
			}
			
			System.out.println();
		}
		

	}
}

/*
 * 
* •Line 10 - 세로줄은 0~4까지 총 5번 반복한다. •i = 0이고 j가 1,2,3,4,5 반복할 때 12345 출력 // System.out.print(j)
i = 1이고 j가 1,2,3,4,5 반복할 때 23456 출력 // System.out.print(j+1)
i = 2이고 j가 1,2,3,4,5 반복할 때 34567 출력 // System.out.print(j+2)
i = 3이고 j가 1,2,3,4,5 반복할 때 45678 출력 // System.out.print(j+3)
...
...
즉, 각 줄마다 (j+i)를 출력한다

 */
