package Scoremanage;

import java.util.Arrays;
import java.util.zip.Inflater;

import javax.crypto.spec.DHPublicKeySpec;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.omg.CORBA.PUBLIC_MEMBER;

import Problem3.Java100Methodreturn2;
import practicc2.if_1;

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
	Student[] students; // 학생수
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
	public String toString() {
		return "총합 " + students.length +"명(평균"+(int)(average*10)/10f+"점)";
	}
}

	class B extends A{ //평균미만학생수 카운트
		int belowAvg = 0;
		
		public void getStudentBelowAvg() {
			for(Student s:students) {
				if(s.score < average) {
					belowAvg++;
				}
			}
			}
		public String toString() {
			return "총합 " + students.length + "명 (평균 " + (int)(average*10)/10f + "점) (평균 미만 "+belowAvg+"명)";
		}
		
	}
	class C extends B{
		String[] grades = {"A", "B", "C", "D", "F"}; // String 배열
		int[] gradesCnt = new int[grades.length]; //grades 의길이만큼배열에추가 //평점별학생카운트
		
		public void getGrade() { //평점구하기
			for(Student s:students) {
			if(s.score>=90) {
				s.grade = "A";
			}else if(s.score>=80) {
				s.grade="B";
			} else if(s.score>=70) {
				s.grade="C";
			}else if(s.score>=60) {
				s.grade = "C";
			}else {
				s.grade ="F";
			}
			
			}
		}
		public void getGradeCnt() { // 평점별 학생수 카운트
			for(Student s : students) {
				switch (s.grade) {
				case "A":
					gradesCnt[0]++;
					break;
				case "B":
					gradesCnt[1]++;
					break;
				case "C":
					gradesCnt[2]++;
					break;
				case "D":
					gradesCnt[3]++;
					break;
				default:
					gradesCnt[4]++;
				}
				
			}
		}
		public String toString() {
			return "종합"+students.length +"명 (평균"+(int)(average*10)/10f+"점)";
		}
		public void printGraph() { //가로형태 막대그래프 그리기
			System.out.println(Arrays.toString(gradesCnt));
			for(int i=0; i<grades.length; i++) {
				System.out.printf("%s(%d)|", grades[i], gradesCnt[i]);
				for(int j=0; j<gradesCnt[i]; j++) {
					System.out.println("*");
				}
				System.out.println();
			}
			System.out.println("===========");
			System.out.println(toString());
		}
	}
public class Main {

	public static void main(String[] args) {
		Student[] s = {new Student(100), new Student(95), new Student(50),
				new Student(75), new Student(78), new Student(89),
                new Student(82), new Student(83), new Student(81)
        };
		
		A a = new A();
		a.insertScore(s);
		a.getTotalScore();
		a.getAverage();
		System.out.println("A클래스 이용:"+a);
		
		B b =new B();
		b.insertScore(s);
		b.getTotalScore();
		b.getAverage();
		b.getStudentBelowAvg();
		  System.out.println("B클래스 이용: "+b);
		  
		C c= new C();
		c.insertScore(s);
		c.getTotalScore();
		c.getAverage();
		c.getStudentBelowAvg();
		c.getGrade();
		c.getGradeCnt();
		System.out.println("--------");
		System.out.println("C클래스 이용");
		c.printGraph();

	}

}
