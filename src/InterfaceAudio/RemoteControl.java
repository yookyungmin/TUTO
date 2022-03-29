package InterfaceAudio;

public interface RemoteControl {
 
		//상수 필드
	//상수명은 대문자로 작성회
	//서로 다른 단어로 구성 되어 있을경우 언더바로 연결하는것이 관례
	//public,static, final 을 생략하더라도 자동적으로 컴파일 과정에서 붙음
	public int MAX_VOLUME=10;
	public int MIN_VOLUME = 0;

	//추상 메소드
	//public abstract 작성해주지 않아도 컴파일 과정에서 자동으로 붙는다
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메소드 일반메소드처럼씀 재정의가능
	default void setMute(boolean mute) {
		//true면 if실행 false면 else 실행
		if(mute) {
			System.out.println(toString()+"무음 처리합니다");
		}else {
			System.out.println(toString()+" 무음 해체합니다");
		}
	}
	@Override
	String toString();
	//정적메소드 재저의 불가
	static void changeBattery() {
		System.out.println("건전지를 교환힙니다");
}
}
	


