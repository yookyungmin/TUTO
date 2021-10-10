package Practice;

public class Excercise4_3 {
// [4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
	public static void main(String[] args) {
		int sum = 0;
		int totalsum = 0;
		
		for(int i= 1; i<=10;i++) {
			sum += i;
			//1, 1+2, 1+2+3,1+2+3+4, 1+2+3+4+5,...,
			totalsum +=sum;
			//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+1
		}
		System.out.println("종합 합 ="+totalsum);
	}

}
