 package Practice;

public class Excercise3_4 {

	public static void main(String[] args) {
		int Apple = 123; // 사과의 개수
		int oneBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		
//		int NumBucket = Apple/oneBucket + (Apple%oneBucket>0 ? 1 : 0);
		//삼항연산자
		//사과의 개수/바구니의 크기 나눌때 나머지가 하나 있으면 바구니가 더 필요해서 나머지
		//나머지 연산을 이횽해 개수에 +1을 해줘야한다. 나머지가 0보다 크면 1을 더한다.
//		int NumBucket =(int)(Math.round(Apple/oneBucket)+1);
		int NumBucket =(int)(Math.round(Apple*0.1)+1);
		
		System.out.println("필요한 바구니의 수="+NumBucket);
		

	}

}
