package Practice;
class Exercise6_2{
	public static void main(String[] args){

	Student s = new Student("홍길동", 1, 1, 100, 60,76);
	String str = s.info();
	System.out.println(str);
}

}

class Student {
String name; //이름

int ban; // 반 
int no;//번호
int kor;
int eng;
int math;
	Student(String name, int ban, int no, int kor, int eng, int math) { //매개변수가 있는 생성자
	this.name = name; // 
	this.ban= ban;
	this.no = no;
	this.kor = kor;
	this. eng = eng;
	this.math = math;
}

/*@Override
public String toString(){

return "이름은" + name +"번호는 " +no+ "입니다";
} //메인함수에서 toString()사용을 위한 오버라이딩  */

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
	+"," +(kor+eng+math)
	+"," +((int)((kor+eng+math)/3f*10+0.5f)/10f);  //평균
}//스트링 모양
}
/*236 / 3 78 →
236 / 3f 78.666664 →
236 / 3f * 10 786.66664 →
236 / 3f * 10 + 0.5 787.16664 →
(int)(236 / 3f * 10 + 0.5) (int)787.16664 → → 787
(int)(236 / 3f * 10 + 0.5) / 10 78 →
(int)(236 / 3f * 10 + 0.5) / 10f 78.7 */
