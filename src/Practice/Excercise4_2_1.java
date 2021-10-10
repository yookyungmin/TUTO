package Practice;



public class Excercise4_2_1 {
	public static void main(String[] args) {
		
			int sum = 0; // 총합
	
	for(int i=1; i<=20; i++) {
		if(i%2!=0 && i%3!=0 ) { // i 가 2또는 3의 배수가 아닐때만 sum에 1을 더한다.
			sum +=i;
					
		}
		
	}
	System.out.println("sum="+sum);

}
}
