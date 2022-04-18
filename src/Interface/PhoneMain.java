package Interface;

import Problem3.Java100Methodreturn2;
//인터페이스 
interface Phone{
	int version = 12;
	public abstract String getManufacturer();
	String getOS(); //public abstract 생략가능
	
//	private void printInfo() {
//		System.out.println("Print Information");
//	} 자바 9부터 가능
	
	default void printRing() { //인터페이스의 기본 메소드 구현하는 클래에서 재정의가능
		System.out.println("sound : ring ring ring~~");
	}
	static void printUser(String user) { //참조형 매개변수
		System.out.println("User = "+user);
	}
} //phone 인터페이스

interface Watch{ 
	String getAppearance();
}//watch 인터페이스

interface Device extends Phone, Watch{} //인터페이스간의 상속 extends

class Machine implements Device{

	@Override
	public String getManufacturer() {
		return null;
	}

	@Override
	public String getOS() {
		return null;
	}

	@Override
	public String getAppearance() {
	
		return null;
	}

}
class Iphone implements Phone{
	@Override
	public String getManufacturer() { //여기 메소드에서 public 빼면 default라서 붙여야댐
		return "APPLE";
	}

	@Override
	public String getOS() {
		return "MacOS";
	}
}

 class Galaxy implements Phone{
	
	@Override
	public  String getManufacturer(){
	return "Samsung";
	}
	@Override
	public String getOS(){
	return "ANDROID";
	}	
	@Override
	public void printRing() {
		System.out.println("Sound : Ring~~~~"); //인터페이스의 디폴트메소드 재정의
	}
}



public class PhoneMain {

	public static void main(String[] args) {
		Phone galaxy = new Galaxy();
		Phone iphone = new Iphone();
		
		System.out.println(galaxy.getManufacturer());
		System.out.println(galaxy.getOS());
		galaxy.printRing();
		System.out.println("================");
		System.out.println(iphone.getManufacturer());
		System.out.println(iphone.getOS());
		iphone.printRing();
		
		
		//static 메소드 사용
		Phone.printUser("홍길동");
	}

}
