package classpath;


public class Student {
	int StudentID; //정수형
	String studentName; // 문자열
	int grade;
	String address; //문자열
	
	
	public void showStudentInfor() {
		System.out.println(StudentID+","+address);

		
		
	}
	
	public static void mian(String[] args) {
		

		Student studentLee = new Student();
		studentLee.studentName= "이순신";
		studentLee.address= " 서울시 서초구 서초동";
		
		studentLee.showStudentInfor();
	}

}
