package Problem4;

import java.security.KeyManagementException;

import org.omg.CORBA.PUBLIC_MEMBER;

import test.Super;

//메인
public class Java100interface {

	public static void main(String[] args) {
		
		
		//[1] 객체생성
		
		Student s1 = new Student("홍길동", 20, 85);
		
		//2 클래스와 인터페이스로부터 상속(Person)과 구현(Allowance, Train)을 한 메서드 호출
		s1.wash();
		s1.study();
		s1.play();
		s1.in(10000,"엄마");
		s1.out(2000, "편의점");
		s1.train(100000, "아빠");
	
		System.out.println(s1.aaa); // 인터페이스의 상수필드 사용하기
		System.out.println(s1.bbb);
		
		
		System.out.println(Allowance.aaa); //객체 생성없이 사용 가능 인터페이스명.변수명
	
	
	}
}

//Person 클래스
class Person{
	//Field
	String name;
	int age;
	int weight;
	
	
	//생성자
	Person() {}
	Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	//메서드
	void wash( ) {System.out.println("씻다");}
	void study() {System.out.println("공부하다");}
	void play() {System.out.println("놀다");}
} //부모클래스

//A인터페이스(부모)

interface Allowance {
	//Field
	//변수는 안되나 상수는 되므로 상수로 지정해주면도미// public static final 붙여주면됨
	//인터페이스 내 모든 필드느느 public static final이어야 함 !! // 생략가능항상붙으니까  // 그냥 타입 상수명 지저애서 쓰면됨
	public static final String aaa = "코리아";
	int bbb = 100;  //public static 생략
	
	//Abstract 인터페이스안에는 추상메서드만 사용 가능
	abstract void in(int price, String name);
	abstract void out(int price, String name); // 용돈 입출금, 지출내역 이름
	
}
//B인터페이스(부모)
interface Train{
	//Abstract 인터페이스안에는 추상메서드만 사용 가능

	abstract void train(int trainubg_pay, String name);
	
}

//Sutdent 클래스 (자식)
class Student extends Person implements Allowance, Train{ 
	
	//Field
	
	
	//생성자
	Student(){}
	Student(String name, int age, int weight){
		super(name, age, weight);
	
	}
	
	//메서드 
	
		public void in(int price, String name) {System.out.printf("%s에게서 %d원 용돈을 받았습니다\n", name, price);} //Allowance
		public void out(int price, String name) {System.out.printf("%d원을 지출 했습니다 [지출용도-->%s]\n", price, name);}//Allowance
		public void train(int trainin_pay, String name) {System.out.printf("%s--> %d원 입금완료", name, trainin_pay);}//Train
	} //자식 클래스



//The type Student must implement the inherited abstract method 추상메서드 구현안하면남

