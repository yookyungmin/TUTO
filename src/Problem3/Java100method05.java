package Problem3;
//메인 메서드에서 정수 100을 callby reference 방식으로 메서드 호출하는 코드 구현
//public class Java100method05 {
//	
//	public static void sum(int a) {
//		a+=400;
//		System.out.println(a);//500 
//	}
//	public static void main(String[] args) {
//		//[1]변수선언
//		int a=100;
//		sum(a); //sum이라는 메서드를 값에 의해 호출하고 있따
//		System.out.println(a); //100
//				
//	}
//}  //call by value 기본형타입 값에 의한 호출 복사하여 처리하기 떄문에 안전하다 원래 값 보존, 복사를 하기ㄸ문에 메모리 사용량 늘어남

	class TestNumber {
		int num;  //변수
		TestNumber(int num){ // 생성자 매개변수가있는
			this.num = num; //인스턴스 num  = 매개변수 num 구분하기 위해 this사용
		}
	}
public class Java100method05 {
	
	public static void sum(TestNumber a) {
		System.out.println("sum메서드 안에서의 a값="+a); //--a값 TestNumber주소) 출력해보면 주소가 들어있음을 알수있따Problem3.TestNumber@19e0bfd
		System.out.println(a.num); //100;
		
		a.num+= 400; // a.num=a.num + 400 
		System.out.println(a.num);  // 100+400 //메인 값도 바뀜
	
	}
	
	public static void main(String[] args) {
		//[1]객체 변수선언
		TestNumber a = new TestNumber(100); //객체생성  // new = 객체 생성, 객체생성된 주소값a 반환을해줌
		sum(a); // sum이라는메서드를 주소값 a에 의해서 호출하고 있다 
		
		System.out.println("메인 메서드 안에서의 a값="+a); // Problem3.TestNumber@19e0bfd
		System.out.println(a.num);
				
	}
}  //call by reference  참조에 의한 호출을 의미 전달받은값을 직접 참조하거나 전달받은 값을 변경할경우 원본도 같이 변경