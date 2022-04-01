package Problem5;
//참조변수와 생성자의 대입된 타입(타입 매개변수)은 일치(상속관계여도 안됨 무조건 일치해야함)
//지네릭클래스간의 다형성은 성립 다형성:조상클래스의 참조변수로 자손클래스의 객체를 다룰수 있다
//매개변수의 다형성도성립
import java.util.ArrayList;

class Product{}
class Tv extends Product {}
class Audio extends Product{}

public class Ex12_1 {

	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		//ArrayList<Product> tvList = new ArrayList<Tv>(); //에러 지네릭타입이 다랄에러
		//List<Tv> tvList = new ArrayList<Tv>(); //Ok. 다형성'
		
		productList.add(new Tv()); //Public boolean add(Product e) { Product와 자손들 다 ok
		productList.add(new Audio());
		
		tvList.add(new Tv()); //public boolean add(Tv e) {  Tv또는 그자손들밖에 못들어옴
		tvList.add(new Tv());
		//tvList.add(new Audio()); //Tv와 Audio 관계없어서 안됨 컴파일에러
		
		printAll(productList);
		//printAll(tvList); //참조변수 대입된 Product와 생성자에 대입된 타입Tv불일치
	}
	
	public static void printAll(ArrayList<Product>list) { //스태틱메소드 , ArrayLList의 Product만 가능 , 참조변수 대입된 Product와 생성자에 대입된 타입Tv불일치
		for(Product p:list) //향상된for문
			System.out.println(p);
	}

}
