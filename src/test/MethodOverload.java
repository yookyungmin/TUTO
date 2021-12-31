package test;
class Test{
	static void display(int num1) { System.out.println(num1); }
	static void display(int num1, double num2) { System.out.println(num1*num2);}
	static void display(int num1, int num2) { System.out.println(num1*num2);}
}
	public class MethodOverload{
	public static void main(String[] args) {
	
	Test myfunc = new Test();
	myfunc.display(10);
	myfunc.display(10, 50);
	myfunc.display(10, 50.34);
}
}