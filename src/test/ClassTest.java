package test;
class Method{
	int a = 10, b=20;
	int add() { return a+b;}
	static int add(int x, int y) {return x+y;}
	static int multiply(int x, int y) {
		return x*y;
	}

}

public class ClassTest {
	public static void main(String[] args) {
		
	
	System.out.println(Method.add(20, 30));
	System.out.println(Method.multiply(30, 60));
	
	Method myM = new Method();
	System.out.println(myM.add(20, 30));
}
	
}