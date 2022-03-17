import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.xml.stream.events.Namespace;

import practicc2.if_1;

class User{
	private String id;
	private String number;
	private int point;
	private char grade;
	
	
	
	User(){
		this("홍길동", "010-1111-1234", 100);
	}

	User(String id,  String number, int point){
		this.id = id;
		this.number = number;
		this.point = point;
		setGrade(point);
	
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void setGrade(int point) { //setGrade 메소드 오버로딩
		if(point >=1000) {
			this.grade = 'a'; //  1000포인트 이상이면 a
		}
		else if(point >= 500) {
			this.grade = 'b';
		}
		else		
			this.grade = 'c';
		
	}
	
	public void getUserInfo() {
		System.out.println("사용자아이디= "+this.id+ " 사용자 등급= "+this.grade+ " 전화번호= "+number+", "+point+" 포인트");
		} /// 사용자 정보 메서드
	}//User 클래스
	

public class User1 {
	public static void main(String[] args) {
		

		User[] u = new User[] {
				new User("가제트", "010-5156-4688", 1000),
				new User("고길동", "010-5542-1876", 650),
				new User("둘리", "010-8746-2486", 200),
				new User()
				};

		for(int i =0; i<u.length; i++) {
			u[i].getUserInfo();
		}
		
	
		
	}
}


