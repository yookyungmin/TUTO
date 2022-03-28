package test;

class Animal{
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("Dog can walk and run");
	}
	void cry() {
		System.out.println("wak");
	}
}

public class Animall {
		public static void main(String[] args) {
			Animal a = new Animal(); //Animal 참조, Animal 객체
			Animal b = new Dog(); //Animal 참조 Dog 객체
			
			
			Dog b1 = (Dog)b;
			
			Dog d = new Dog();
			Animal a1 =(Animal)d;
			
			a.move();  //Animal 클래스에 정의된 메서드 실행
			b.move(); //Dog 클래스에 정의된 메서드가 실행됨//오버라이딩한거라 사용가능
//			b.cry(); //자손클래스만의 메서드라 사용불가
			d.move();// 자손 move 메소드
			d.cry();
			a1.move();//자손move메소드

			
			b1.move();
			b1.cry();
		}
	

}
