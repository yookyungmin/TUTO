
// 캡슐화 (은닉 private)

public class Car {
	public String name;
	private int currentSpeed;

	public void start_Engine() {
		System.out.println(name+"의 시동을 켠다.");
		currentSpeed = 1;
	}

	private int CurrentSpeed() {
		currentSpeed = currentSpeed * 10;
		return currentSpeed;
	}

	public String get_CurrentSpeed() {
		return name + "의 속도는 "+ CurrentSpeed();
	}
}


//상속 extends
class MyTaxi {
	String name;
	int currentGear;

	public void changeGrear(int gear) {
		System.out.println(" 기어를 "+ gear + "단으로 변경한다");
		currentGear = gear;
	}
	
	public String get_CurrentState() {
		return name + "의 현재 기어 상태:" + currentGear;
	}

}
class Taxi extends Car {
		int fare;
		int passenger;
	}
	//다형성 
	//오버라이딩
	class MyTaxi extends Taxi {
   	public void changeGrear(int gear) {
		System.out.println("기어를 "+gear+"변경후 고정한다.");
		currentGear=gear;
	}

public static void main(String[] args) {
		MyTaxi taxi = new MyTaxi();
		taxi.name = "24바 3982";
		taxi.currentGear = 1;
		taxi.fare = 6200;
		taxi.passenger = 2;
		taxi.changeGrear(2);
		taxi.get_CurrentState();

	}

}
