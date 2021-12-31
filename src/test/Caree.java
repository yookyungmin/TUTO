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
//		Care c = new Care();
		Care c = new FireEngine();
		FireEngine fe = new FireEngine(); // 객체 생성
		
		FireEngine fe2=(FireEngine)c;
		
		Care c3 =(Care)fe;
		
			
//		fe2.water(); // 에러
//		fe2.drive();
		c.drive();
		c.stop();
		fe2.water();
		fe2.stop();
		fe.water();
		fe.stop();
		c3.stop();
//		c3.water(); 안됨
	}

}
