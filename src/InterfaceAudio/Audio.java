package InterfaceAudio;

public class Audio {

	public static void main(String[] args) {
		//상수 사용하기 ->인터페이스명.상수명
		//맥스볼륨 출력하기
		
		System.out.println(RemoteControl.MAX_VOLUME);
		//Min볼륨에 5더해서출력하기
		int num = RemoteControl.MIN_VOLUME +5;
		System.out.println(num);
		System.out.println("---------------------------");
		
		//추상메소드 사용하기
		//일반 클래스에 연결후 오버라이딩해서 출력가능
		Tv tv = new Tv();
		tv.turnOn();
		tv.setVolume(50);
		tv.turnOff();
		
		Lamp lamp =new Lamp();
		lamp.turnOn();
		lamp.setMute(true);
		lamp.turnOff();
		System.out.println("------------");

		
		//디폴트 메소드 사용하기
		tv.setMute(true);
		lamp.setMute(true);
		
		//정적메소드 사용하기 
		//static이라 다른곳에서 오버라이딩(재정의)불가
		//객체 생성된것으로 불러오기 안됨
		//클래스명.메소드명 호출가능
		RemoteControl.changeBattery();
		//tv.ChangeBattery(); //안됨
	}

}
