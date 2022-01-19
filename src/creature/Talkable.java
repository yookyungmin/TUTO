package creature;

public interface Talkable {
	//	public static final int 상수이름 값; 상수만 사용가능, public static final 생략해도 자동으로 생성
	public abstract void talk(); //추상메서드 public 생략가능 
	
	// 8부터 디폴트 메서드도 사용가능	
	//default int() {System.out.println()}  접근제어가 public 생략가능 일반메서드처럼 {}몸통 있어야함  인터페이스 구현한 클래스에서 
	//재정의 가능 오버라이딩 구현부변경 매개변수는 그대로
	
	//정적메서드 static method도 사용가능 객체 없이 사용가능 스태틱메소드는구현한 클래스에서 재정의 불가능 
	//static int () {}
}
