package Practice;
class MyTv{

	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void
	turnOnOff() {
	//(1) isPowerOn의 값이 true면 false로 false면 true로 바꾼다.
	isPowerOn = !isPowerOn;
}
	//(2)voulume값이 MIN_VOLUME값보다 적을때만 값을 1증가 시킨다.
	void volumeUp() {
	if(volume < MAX_VOLUME) 
	volume ++;
	}
	//(3)volume 값이 Min_volume 값보다 클때만 값을 1감소시킨다.
	void volumeDown() {
		if(volume>MIN_VOLUME)
			volume--;
		//
	}
	void channelUp() {
		//(4)channel의 값을 1증가 시킨다.
		//만일 channel이 MAX_CHANNEL이면, CHANNEL값을 MiN_CHANNEL로 바꾼다.
		if(channel == MAX_CHANNEL) {
				channel =MIN_CHANNEL;
		}	else {
			channel++;
		}
	
	}
	void channelDown() {
		//(5) channel 값을 1감소시킨다.
		//만일 channel MIN_CHANNEL이면, CHANNEL값을 MAXCHANNEL로바군다
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL; 
				
		}else {
			channel--;
		}
			
	} 
}// class MyTv
class Exercise6_19{
	public static void main(String args[]) {
		MyTv t = new MyTv(); //객체 생성
		
		t.channel = 100;
		t.volume =0;
		System.out.println("CH:"+t.channel+",VOL="+t.volume);
	
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL="+t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+",VOL="+t.volume);
	}
}













