package Problem3;
		//메인메서드에서 100을 보냈을때 값이 수정되게끔 call by reference 방식으로 코드 수정
	//이문제는 앞서 다뤘던 call by value 방식으로 call by referecne방식으로 수정해서 보내라는으미

public class Java100Method04 {
	public static void sum(int a) {
			System.out.println();
	}
	public static void main(String[] args) {
			
			
			//[1] 변수선언 및 메서드 호출
			//주소값을 보내야지 sum 메서드 결과값과 출력값이 같아짐
		//wrapper 클래스의 Integer 클래스 타입으로 변수 a를 선언하고, new 객체로 생성하여
		//wrapper = 기본타입 데이터를 객체로 포장
		//해당 주소 값을 메서드로 보낸다.
		
			Java100Method04 a = new Java100method04();

	
			System.out.println(a);
	}
}
