package creature;

public abstract class Human extends Creature implements Talkable{
		public Human(int x, int y, int age) {
			super(x, y, age); // Creature 조상클래스의 생성자
		}
		
		
		@Override
		public void attack() {
			System.out.println("도구를 사용!");
		} //추상 메서드 구현
		
		@Override
		public void talk() {
			System.out.println("사람은 말을 할수 있다");
		}
		
}
