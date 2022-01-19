package creature;

public class Pigeon extends Animal implements Flyable {
	public Pigeon(int x, int y, int age) {
		super(x, y, age);
			}
	
	@Override
	public void fly(int yDistance) {
		setY(getY()+yDistance);
	}

	public void flymove(int xDistance, int yDistance) {
		setY(getY()+yDistance);
		setX(getX()+xDistance);
	}
	
	@Override 
	public void printInfo() {  //Creature의 printInfo 구현
		System.out.println("Pigeon ->"+toString());
	}
}
