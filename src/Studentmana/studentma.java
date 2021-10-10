package Studentmana;

public class studentma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Student {
	private	String name; //이름 

	private	int StudentID; //id
	private	int ban; // 접근제한자 private로 해야 게터 세터사용가능

	private int kor;
	private int math;
	private int eng;
	
	Student(String name, int StudentID, int ban, int kor, int eng, int math) { //매개변수가 있는 생성자
	this.name = name; // 
	this.StudentID = StudentID;
	this.ban= ban;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	
	
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		this.StudentID = studentID;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	int getTotal() { //합계
		return kor+eng+math;
	}
		float getAverage() {//평균
			return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
}

