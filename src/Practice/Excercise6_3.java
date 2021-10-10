package Practice;
class Excercise6_3{
	public static void main(String[] args){

	Student s = new Student();
	s.name = "홍길동";
	s.ban = 1;
	s.no = 1;
	s.kor = 100;
	s.eng = 60;
	s.math = 76;
	System.out.println("이름:" + s.name);
	System.out.println("총점:" + s.getTotal());
	System.out.println("평균:"+ s.getAverage());

}

}

class Student {
String name; //이름

int ban; // 반 
int no;//번호
int kor;
int eng;
int math;

Student() {} //기본 생성자

	Student(String name, int ban, int no, int kor, int eng, int math) { //매개변수가 있는 생성자
	this.name = name; // 
	this.ban= ban;
	this.no = no;
	this.kor = kor;
	this. eng = eng;
	this.math = math;
}

int getTotal() {//총합 구하는 메서드
	return kor+eng+math;
}
float getAverage() { // 평균을 구하는 메서드
	return (int)(getTotal()/3f*10+0.5f)/10f;
}




/* this 는 위 코드처럼 생성자의 매개변수로 선언된 변수의 이름이 인스턴스 변수와 같을 때 인스턴스 변수와 지역변수를 구분하기 위해서 사용한다.

Student() 생성자 안에서의 this.name는 인스턴스 변수이고, name는 매개변수로 정의된 지역변수이다.

static 메서드에서는 this를 사용하지 못한다.*/

public String info() {
	return name
	+"," +ban
	+"," +no
	+"," +kor
	+"," +eng
	+"," +math
	+"," +getTotal()
	+"," +getAverage();
}//스트링 모양
}
