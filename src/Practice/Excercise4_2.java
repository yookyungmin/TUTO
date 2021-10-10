package Practice;

public class Excercise4_2 {
// 1~n 까지 2의 배수 3의배수가 아닌 값들 합
	public static void main(String[] args) {
		int sum = 0; // 총합을 저장할변수
		int num = 0; //범위가 도리 숫자를 저장할 변수선언 
		 for (int i = 1; i<=20; i++) {
			 if ((i%2)==0) {
				 continue;
			 }
			 if((i%3)==0) {
				 continue;
			 }
			 else { //그외의 경우
				 System.out.print(i+ " ");
				 sum += i;
				 
			 }
		 }
		 System.out.println();
		 
		 System.out.println("총합 :"+sum); //결과출력
	}

}
