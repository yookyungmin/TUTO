package Problem5;
//제네릭개념

import javax.sql.rowset.JoinRowSet;

//class Sample {
//	
//	//생성
//	private String obj;
//	//생성자
//	Sample(String x){
//		this.obj =x;
//	}
//	//메소드
//	public String getObj() {
//		return obj;
//	}
//	
//	void printInfo() {
//		System.out.println(obj.getClass().getName()); //객체가 속하는 클래스의 정보를 출력하는 메소드 ? //생성자 타입이String일떄 getClass
//	}
//} 
//public class Java100generic {
//
//	public static void main(String[] args) {
//		//[1]객체 생성  문자열
//		
//		Sample s1 = new Sample("안녕하세요~");
//		System.out.println(s1.getObj());
//		s1.printInfo();
//		
//		
////		//[2]객체 생성 숫자
////		Sample s2 = new Sample(100);
////		
////		System.out.println(s2.getObj()); //100
////		

class Sample {
	
	//생성
	private Object obj;
	//생성자
	Sample(Object x){
		this.obj =x;
	}
	//메소드
	public Object getObj() {
		return obj;
	}
	
	void printInfo() {
		System.out.println(obj.getClass().getName()); //객체가 속하는 클래스의 정보를 출력하는 메소드 ? //
	}
} 
public class Java100generic {

	public static void main(String[] args) {
		//[1]객체 생성  문자열
		
		Sample s1 = new Sample("안녕하세요~");
		System.out.println(s1.getObj());
		s1.printInfo();
		System.out.println("---------------------");
		
		
		//[2]객체 생성 숫자
		Sample s2 = new Sample(100);
		System.out.println(s2.getObj()); //100
		s2.printInfo();
		System.out.println("---------------------");
		

		//[3] 객체 생성 >> OBJECT
		Sample s3 = new Sample(new Object());
		System.out.println(s3.getObj());
		s3.printInfo();
		System.out.println("----------------");
		
		//[4] 위와 같이 사용시 -->단점
		//s1 문자열
		s1.getObj();
//		ㅋ
	}

}
