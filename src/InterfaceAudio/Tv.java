package InterfaceAudio;

import javax.swing.text.DefaultHighlighter;

import org.omg.CORBA.PRIVATE_MEMBER;

import practicc2.if_1;

public class Tv implements RemoteControl{


		//필드 
		private int volume;
		
		@Override
		public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME) { //볼륨이 최대보다 크면
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume<RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}
			else {
				this.volume = volume;
			}
			 System.out.println("현재 볼륨:"+ volume);
			 if(volume>8){
				 System.out.println("청력을 위해 볼륨을 줄이세요");
			 }
	}
	

	@Override
	public void turnOn() {
		System.out.println(toString()+"을 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println(toString()+"을 끕니다");
		
	}
	@Override
	public String toString() {
		return "Tv";
	}

	}

	

