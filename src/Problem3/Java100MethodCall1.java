package Problem3;
//메서드로 인자 전달시 정수 100을 보냈을떄 때 아래 코드 결과를 말해보시오
	//이문제는 자바 기본형 타입과 참조형 타입의 다양한 메서드호출방식에 대해 아는지 묻는문제

public class Java100MethodCall1 {
		//[1] call by value 값에 의한 호출 ->
		//메서드로 인자값을 넘길때 해당값을 복사하며 넘기는 방식 
		//따라서 sum()내부에서는 복사된 값을 처리
		//ex)기본형타입 int a = 100  100을 보냄 
	public static void sum(int a) {
		a+=400; // a= a+400
		System.out.println(a);
	}
		public static void main(String[] args) {
			//[1] 변수 선언 및 메서드 호출
			int a=100; //기본형타입
			sum(a);
			//[2] 출력
			System.out.println(a);
		}
}
