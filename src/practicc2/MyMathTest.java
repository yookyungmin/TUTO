package practicc2;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm =	new MyMath(); //객체생성
		long result1 = mm.add(5, 80L);
		long result2 = mm.subtract(5L, 3);
		long result3 = mm.multiply(5L, 3); //L을 붙여서 범위늘려줌 // 클래스의 매개변수타입 long, int 타입에 맞게 
		double result4 = mm.divide(5L, 3L); //클래스 매개변수가 double이 되어도 long을 넣으면 5.0으로 바껴 호출가능
		

		
		System.out.println("add(5L,3L)="+ ""+result1); //더하기
		System.out.println("substract(5L,3L)="+result2); //빼기
		System.out.println("multiply(5L,3L="+result3);//곱
		System.out.println("divide(5L,3L="+result4);
		
	}

} //main

class MyMath { //클래스
	long add(long a, long b) {
		long result = a+b;
		return result;
		// return a+b; 
	}
	
	long subtract (long a, long b) {return a-b;}
	long multiply(long a, int b) {return a*b;}
	double divide(double a, double b) {
		return a/b;
	}
}
