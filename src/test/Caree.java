package test;


class Care{
	
	String Color;
	int door;
	
	void drive() {
		//운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	void stop() {//멈추는 기능
		System.out.println("stop!!!");
	}
	
}
class FireEngine extends Care{ //소방차
	void water() { //물을 뿌리는 기능
		System.out.println("water!!");
		
	}
	
}
public class Caree {

	public static void main(String args[]) {
		

////		Care c = new Care();
		FireEngine fe = new FireEngine(); // 객체 생성
		fe.water();
		fe.stop();
		
		Care c2 = (Care)fe; // 사용가능 멤버 갯수조절
//		c2.water(); c2로 형변환해서 fe의 인스턴스 사용안됨 리모컨 Care로변경
		c2.stop();
		c2.drive();
//---------------		
		Care c = new FireEngine();
		FireEngine fe2=(FireEngine)c;
		fe2.water();
		fe2.stop();
		
	
//		====================================================================================
//		
//		Care c3 =(Care)fe;
//		
//			
////		fe2.water(); // 에러
////		fe2.drive();
//		c.drive();
//		c.stop();
//		c3.stop();
////		c3.water(); 안됨
		
//		Care c = new FireEngine();// 조상 참조변수 자손 클래스 참조해야
////		FireEngine fe = new FireEngine();	
//			FireEngine	fe2 = (FireEngine)c;
//			fe2.water(); //가능
	}

}
