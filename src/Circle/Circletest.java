package Circle;

import practicc2.if_1;

class Circle {
	private static double radius;
	private String color;
	private final static double PI = 3.141592;

	Circle(){
	this(10);
	}//기본값
	Circle(double radius){ //생성자 매개변수1개
	this.radius = radius;
	}
	Circle(double radius, String color){  //생성자 매개변수 2개
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
		return radius*radius*PI;
	}
	public double findCircumference(){ //원의 둘레
		return 2*PI*radius;
	}
	
	public boolean sameCircle(Circle c) { //원을 판정하는 sameCircle()
		if(radius==radius && color.equals(c)) {
			return  true;
		}else {
			return false;
		}
		}  // 검토필요 이상
	
	
	public String show() {
		return "원객체의 색깔은 = "+color+ "반지름의 길이는 = "+radius;
	}
}


class CircleArrayDemo{
	double number;
	
	Circle[] c = new Circle[10];
	
	
}

public class Circletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
