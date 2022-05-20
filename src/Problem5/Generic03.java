package Problem5;

import org.omg.CORBA.PUBLIC_MEMBER;

import tes1.tes;
//다국어개발자
//제네릭컵이 있는데 커피를 담을수 있고 연필통으로도 사용할수 있다
class Genericclass<T>{
	T ob;
	
	public Genericclass(T ob) {
		this.ob = ob;
	}
	void printType() {
		System.out.println(ob.getClass().getName());
	}
}

class GenericClass2<T, V>{
	T ob;
	V ob2;
	public GenericClass2(T ob, V ob2) {
		this.ob = ob;
		this.ob2 = ob2;
	}
	void printType() {
		System.out.println(ob.getClass().getName());
		System.out.println(ob2.getClass().getName());
	}
}
	public class Generic03{
	public static void main(String[] args) {
		
		Genericclass<Integer> generic = new Genericclass<Integer>(10);
		Genericclass<Double> generic2 = new Genericclass<>(10.0);
//		
//		generic.printType();
//		generic2.printType();

		
		GenericClass2<Integer, Double> generic3 = new GenericClass2(10, 10.0);
		generic3.printType();
	}

}
