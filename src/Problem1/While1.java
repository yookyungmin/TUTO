package Problem1;



public class While1 {

	public static void main(String[] args) {
	 
		//[1] 변수선언
		int number = 1;
		
		while(number<=30){ //조건식
			
			//짝수이면 출력
		
			if(number%2==0) {// 
			System.out.print(number); // 한줄만 쓸떈 {} 생략가능
			} // 짝수출력
//			if(number%2!=0) {
//				System.out.print(number);
//			} //홀수 출력
//		
			
			number ++;
			//반복문을 빠져나오기 위해서는 number 값을 반복떄마다 증가
		}
	}

}


//1~30 까지 수에 짝수인 출력 
//홀수 짝수 구하기 문제를 while 반복문을 사용하여 구현