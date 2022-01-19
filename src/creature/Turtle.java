package creature;

public class Turtle extends Animal implements Swimable {
	public Turtle(int x, int y, int age) {
		super(x, y, age);
		
	}
	public void swimDown(int yDistance) {
		setY(getY() - yDistance);
		
		
	}
	public void printInfo() {
		System.out.println("Turtle ->"+toString()); //Creature의 printInfo 구현
	}
}
