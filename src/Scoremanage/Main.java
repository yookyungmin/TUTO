package Scoremanage;

import Problem3.Java100Methodreturn2;

/*
 * 1. 8명의 자바 중간고사 성적을 입력하고 이들의 합과 평균을 구하는 프로그램을 작성하라.

2. 8명의 성적 중 평균 미만이 몇 명인지 카운트하는 내용을 상기1.에 추가하라.
 */
class Student{ //학생 클래스
	int score;
	String grade;
	
	Student(){}//기본생성자
	
	Student(int score){  // 매개변수 1개 생성자
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "student{"+"score="+score+", grade="+grade+'\''+'}';
	}
	
}

/*
 * class A {
   성적입력();
   성적합계();
   성적평균()
}
 */
class A {
	Student[] students;
	int totalScore; //성적 합계
	double average; //성적 평균
	
	public void insertScore(Student[] student) {
		this.students = student;
	}
	public int getTotalScore() {
		for(Student student : students) {
			totalScore+=student.score;
		}
		return totalScore;
	}
	public double getAverage() {
		average=(double)totalScore/students.length;
		return average;
	}
}
public class Main {

	public static void main(String[] args) {
	

	}

}
