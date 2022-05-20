package Problem5;
//다국어 개발자
class MyHouse{
	private String roof = "normal roof";
	private String wall = "normal wall";
	private Door door;
	
	public void setDoor(Door door){
		this.door = door;
	}
	public void openDoor() {
		door.openDoor();
	}
	
	public void closeDoor() {
		door.closeDoor();
	}
}

	interface Door{
		int width = 20; //상수
		int height = 100;
		
		void openDoor();
		void closeDoor();
	}
	
	class SlideDoor implements Door{

		@Override
		public void openDoor() {
			System.out.println("Door Slided");
			
		}

		@Override
		public void closeDoor() {
			System.out.println("Door Closed");
		}
		
	}
	
	class SecurityDoor implements Door{
		@Override
		public void openDoor() {
			System.out.println("Say Your name");
			
		}

		@Override
		public void closeDoor() {
			System.out.println("Door Closed");
		}
	}
	class NormalDoor implements Door{
		@Override
		public void openDoor() {
			System.out.println("Door open");
			
		}

		@Override
		public void closeDoor() {
			System.out.println("Door Closed");
		}
		
	}
public class Interface01 {

	public static void main(String[] args) {
		MyHouse myHouse = new MyHouse();
		
		myHouse.setDoor(new SlideDoor());
//		myHouse.setDoor(new NormalDoor);
		
		myHouse.openDoor();
		myHouse.closeDoor();
		
		

	}

}
