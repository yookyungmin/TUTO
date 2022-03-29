package InterfaceAudio;

public class Lamp implements RemoteControl{
	@Override
	public void setVolume(int volume) {	
	}
	
	@Override
	public void turnOn() {
		System.out.println(toString() + "를 끕니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println(toString() + "을 켭니다");
	}
	
	
	@Override
	public String toString() {
		return "형광등";
	}
	
    	// default 메소드도 받아와 재정의 후 사용하는 것 가능하다
        // 이 경우 main에서 호출시
        // Interface의 것이 아닌 재정의된 default 메소드가 출력된다
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println(toString() + "을 새로 갈았습니다");
		} else {
			System.out.println(toString() + "이 오래 되었습니다");
		}
	}
}