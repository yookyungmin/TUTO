package creature;

public abstract class Animal extends Creature{
	public Animal(int x, int y, int age) {
	super(x, y, age); // 조상 Creature 클래스의 생성자 호출
	}
		@Override
		public void attack() {
			System.out.println("몸을 사용하여 공격"); //추상클래스의 추상메서드를 구현
		}
}  // 추상 클래스 Creature 를 상속한 추상 Animal 클래스 추상메서드 printinfo를 구현을 안했기에 추상클래스임