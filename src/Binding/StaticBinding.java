package Binding;
//정적바인딩
class School{
	
	public static void ringBell() {
		System.out.println("Ringing the School bell..");
	}
	
}
class Classroom extends School{
	public static void ringBell() {
		System.out.println("Ringing the classroom bell..."); //오버라이딩
	}
}
public class StaticBinding {
	public static void main(String[] args) {
		
		School s1 = new School();
		s1.ringBell(); //Ringing the school bell 
		Classroom c1 = new Classroom();
		c1.ringBell(); //Ringing the classroombell
		School s2 = new Classroom();
		s2.ringBell(); //Ringing the school bell
	}
}


/*
Ringing the school bell...
Ringing the classroom bell...
Ringing the school bell...
*/
