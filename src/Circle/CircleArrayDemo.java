package Circle;

import javax.crypto.spec.RC2ParameterSpec;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import practicc2.if_1;

import java.util.Random;

class Circle {
	private static double radius;
	private String color;
	private final static double PI = 3.141592;

	Circle(){
	this(10);
	}//기본값 반지름 10
	Circle(double radius){ //생성자 매개변수1개  반지름
	this.radius = radius;
	} 
	
	public Circle(double radius, String color){  //생성자 매개변수 2개
		this.radius = radius;
		this.color = color;
	}
	public double getRadius(){
	return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color =color;
	}
	
	public double findArea(){ //원의 넓이
		return this.radius*this.radius*PI;
	}
	public double findCircumference(){ //원의 둘레
		return 2*PI*this.radius;
	}
	
	


	public static boolean sameCircle(Circle c1, Circle c2) { 
		if(c1.radius == c2.radius) {
			if(c1.color.equals(c2.color)){
				System.out.println("두원은 일치합니다");
				return true;
			}else {
				System.out.println("두원은 일치하지 않습니다");
				return false;
			}
			
		}else {
			System.out.println("두원은 일치하지 않습니다");
			return false;
		}
	}	// 반지름과 색깔이 같은 경우 같은 원을 판정하는 메서드 //스새틱 객체생성필요x 

	
	
	public String show() {
		return "원객체의 색깔은 = "+color+ "반지름의 길이는 = "+radius;
	}
}

class Die {
	  int number;
	 
	  final int SIDES = 6;

	  void roll() {
	    Random r = new Random();
	    int no = r.nextInt(SIDES);
	    this.number = (no % SIDES)+1;
	  }
	}

public class CircleArrayDemo{

	public static void main(String[] args) {
		String[] colArr = {"blue", "red", "yellow"};
		Circle[] cArr= new Circle[10]; //원객체 10개를 생성한다


	      Die d = new Die();
	      
	      
	      
	      for(int i = 0; i < 10; i++) {
	          d.roll();
	          
	          cArr[i] = new Circle(d.number, colArr[(int)(Math.random()*3)]);
	       }
	       
		
		System.out.println("=============");
		
		for(Circle c : cArr) {
			
			System.out.println(c.show());
		}
		
		System.out.println("=================");
		
		int len = cArr.length; //cArr의 길이만큼 len에 저장
		
		Circle tmpCircle1 = cArr[(int)(Math.random()*(len-1))];
		Circle tmpCircle2 = cArr[(int)(Math.random()*(len-1))];
		
	
		System.out.println(tmpCircle1.show());
		System.out.println(tmpCircle2.show());
		
		 System.out.println("sameCircle > " + Circle.sameCircle(tmpCircle1, tmpCircle2));
	}

}
