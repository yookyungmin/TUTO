package test;
class Parent{
	int a;

	Parent() { a= 10;} //기본생성자
	Parent(int n) {a = n;}

}

class Child extends Parent{ 
	int b;

	Child() {
		//super(40);
		b = 20;
		}

	void display(){
		System.out.println(a);
		System.out.println(b);
		}
}


	public class Super {
	public static void main(String[] args) {
		Child ch= new Child();	
		ch.display();
}
}
