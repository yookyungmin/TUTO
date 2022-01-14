package Problem3;
//class uge {
//	
//
//	public static  void plusMethod(int a, int b) {
//	
//	System.out.printf("인자로 넘겨받은 2개의 값%d과 %d입니다",a,b);
//	//연산 추력

//	System.out.println();
//	int rst =a+b;
//	System.out.println("두수를 더한값은 "+rst);
//
//	}
//	}

public class Java100method02 {

	public static  void plusMethod(int a, int b) {
		
	System.out.printf("인자로 넘겨받은 2개의 값%d과 %d입니다",a,b);
	//연산 추력
	System.out.println();
	int rst =a+b;
	System.out.println("두수를 더한값은 "+rst);

	}

	
	public static void main(String[] args) {//메인 메서드가static이라 위메서드도 static으로

		//반환값이 없고void추가 받는 인자값이 2개 있는 덧셈 메서드를 구현하시오
		
		//[1]:반환값-->X 받는 인자값-->o
		//메서드가 받는 인자값이 있다는것은 호출부에서 파라미터값을 넘긴다는 뜻
		
//		uge c =new uge(); 메서드가 static 이 아닐시 객체 필요
		int a= 100, b= 200;
//		uge.plusMethod(a,b);
		
		plusMethod(a,b);

		
		
	}

	
}
