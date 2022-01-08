package Problem3;

import java.util.function.DoubleToLongFunction;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.omg.CORBA.PUBLIC_MEMBER;

//getter setter 가포함된 클래스 상속을 코드로 구현해보시오
//이문제는 클래스 상속을 구현시 getter setter 의 개념과 용도를알고 있는지
//부모클래스 person 자식 villain hero

class Person{  //공통된속성
	
	//Field
	
	
	private String name; //클래스안에서만 
	
	private int age;
	
	private int height;
	
	private int weight;

	//constructor
		Person(){} // 기본 생성자
		Person(String name, int age, int height, int weight){
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
		}
	
	
	
	//method  게터세터 private를 메인함수에서 쓰기위해
	public String getName(){return name;}//게터 인자 넣을필요x
	public void  setName(String name) {this.name= name;}
	
	public int getAge() {return age;}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	
	public int getWeight() {return weight;}
	public void setWeight(int Weight) {this.weight = weight;}
	
	public void move() {
		System.out.println("이동중");
	}
  }

class Villain extends Person{

	//Field
	private String unique_key;
	private int weapon; // 1~9  1 창 2 방패 3 총
	private double power;
	
	//생성자
	Villain(){}
	Villain(String name, int age, int height, int weaigth, String unique_key, int weapon, double power) {  //매개변수, 인자값 상속된것까지 합쳐서 7개 초기화 가능
		super(name, age, height, weaigth);// 부모클래스의 생성자 호출
		this.unique_key = unique_key; //this.unique_key 인스턴스변수 = unique_key 지역변수 this. 구분
		this.weapon = weapon;
		this.power = power;
	}
		//생성자안에 매개변수 꼭 7개로 안해도됨
	
	//메서드
	public String getUnique_key() {	return unique_key; }
	public void setUnique_key(String unique_key) {this.unique_key = unique_key;}
	
	public int getWeapon() {return weapon;}
	public void setWweapon(int weapon) {this.weapon = weapon;}
	
	public double getPower() {return power;	}
	public void setPower(double power) {this.power = power;}
	
	//pintPerson 메서드
	public void printPerson() {
		System.out.println("=========================");
		System.out.println("악당이름 ="+getName());
		System.out.println("악당 나이 ="+getAge());
		System.out.println("악당 키 ="+getHeight() +" cm");
		System.out.println("악당 체중 ="+getWeight()+" kg");
		System.out.println("악당 넘버 ="+getUnique_key());
		System.out.println("악당 무기="+getWeaponName(getWeapon())); //1 창 2 방패 3 총 숫자(1~9)
		System.out.println("악당 파워 ="+getPower());
		System.out.println("====================");
		
	}
	
	//getWeaponName 메서드 생성 무기값
	
	public String getWeaponName(int a) {
		String weapon;
		switch (a) {
			case 1:
				weapon = "창";
			break;
			
			case 2:
				weapon ="방패";
			break;
			case 3:
				weapon = "총";
			break;
			
			default: //1~3 을 벗어난 다른값이 들어오면?
				weapon = "--";
			break;
	
		}
		return weapon; // 리턴을 해주면 함수를 호출한 곳으로 이값을 전달
	}
}

class Hero extends Person{
	//필드
	private String unique_key;
	private int weapon;
	private double power;
	//생성자
	Hero(){}//기본생성자
	
	Hero(String name, int age, int height, int weaigth, String unique_key, int weapon, double power){
		super(name, age, height, weaigth); //조상 생성자 호추
		this.unique_key = unique_key; //this.unique_key 인스턴스변수 = unique_key 지역변수 this. 구분
		this.weapon = weapon;
		this.power = power;
	}
	
	
	//메서드
	public String getUnique_key() {return unique_key;}
	public void setUnique_key(String unique_key) {this.unique_key = unique_key;}


	public int getWeapon() {return weapon;}
	public void setWeapon(int weapon) {this.weapon = weapon;}


	public double getPower() {return power;}
	public void setPower(double power) {this.power = power;}
	
	
	public void printPerson() {
		System.out.println("=========================");
		System.out.println("영웅 이름 ="+getName());
		System.out.println("영웅 나이 ="+getAge());
		System.out.println("영웅 키 ="+getHeight() +" cm");
		System.out.println("여웅 체중 ="+getWeight()+" kg");
		System.out.println("영웅 넘버 ="+getUnique_key());
		System.out.println("영웅 무기="+getWeaponName(getWeapon())); //1 창 2 방패 3 총 숫자(1~9)
		System.out.println("영웅 파워 ="+getPower());
		System.out.println("====================");
		
	}
	
	//getWeaponName 메서드 생성 무기값
	
	public String getWeaponName(int a) {
		String weapon;
		switch (a) {
			case 1:
				weapon = "창";
			break;
			
			case 2:
				weapon ="방패";
			break;
			case 3:
				weapon = "총";
			break;
			
			default: //1~3 을 벗어난 다른값이 들어오면?
				weapon = "--";
			break;
	
		}
		return weapon; // 리턴을 해주면 함수를 호출한 곳으로 이값을 전달
	}
}


public class Java100gettersetter {
	

	public static void main(String[] args) {
		//[1]객체생성
//		Person p1 = new Person();
//		p1.setName("홍길동");
//		
//		p1.setHeight(172);
//		System.out.println(p1.getName());
//		System.out.println(p1.getHeight());
		
		//객체생성1
		Villain v1 = new Villain("좀비",20,180,80,"1500",2,99.5);
		v1.printPerson();
		System.out.println(v1.getName()+" ");
		v1.move(); //부모클래스의 move()메서드를 호출
		
		//객체생성2
		Villain v2 = new Villain("도꺠비",30,175,70,"11001121",1,77.5);
		v2.printPerson();
		System.out.println(v2.getName()+" ");
		v2.move(); //부모클래스의 move()메서드를 호출
		
		//객체생성3
		Villain v3 = new Villain("몽달",40,155,70,"1540021",3,65.4);
		v3.printPerson();
		System.out.println(v3.getName()+" ");
		v3.move(); //부모클래스의 move()메서드를 호출
		
		//==hero 객채
		Hero h1 = new Hero("건슬링",25,180,65,"1989",3,55.3);
		h1.printPerson();
		System.out.println(h1.getName()+" ");
		h1.move();
		
	}

}
