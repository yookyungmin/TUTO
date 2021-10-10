package test;

public class FlowEx13 {
//1부터 10까지 합
	public static void main(String[] args) {
		int sum = 0; //합계를 저장하기 위한 변수
		
		for(int i = 1; i<=10; i++) {
			sum+= i; //변수 i를 1부터 ~10까지 변화하면 i를 sum에 더해 누적
			System.out.printf("1부터 %2d까지의 합:%2d,\n",i, sum);
		}

	}

}
