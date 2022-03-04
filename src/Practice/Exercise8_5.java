package Practice;

class Exercise8_5 {
public static void main(String[] args) {
	try {
			method1();
		} catch(Exception e) {
				System.out.println(5);
		}
	}
	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch(ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		System.out.println(4);
	} // method1()
	static void method2() {
			throw new NullPointerException();

/*NullpointerException은 
null값으로 뭔가를 하려고할 때, 
또는 객체가 초기화되지 않은 상태에서 객체의 변수나 메소드를 접근하려고 할 때 발생합니다.*/
}
}
/* ] main method1() , method1() method2() . 메서드가 을 호출하고 은 를 호출한다
method2() NullPointerException , try-catch 에서 이 발생했는데 이 예외를 처리해줄 블럭
이 없으므로 는 종료되고 이를 호출한 으로 되돌아갔는데 여기에는 method2() , method1()
try-catch NullPointerException catch 블럭이 있긴 하지만 을 처리해줄 블럭이 없으므로
method1() , main . finally 도 종료되고 이를 호출한 메서드로 돌아간다 이 때 블럭이 수행되
어 이 출력된다 '3' .
main Exception catch 메서드에서는 모든 예외를 처리할 수 있는 이 선언된 블럭이 있으므
로 예외가 처리되고 가 출력된다 '5' .
변수 의 값이 이므로 이 수행되어 프로그램이 즉시 종료된 b true System.exit(0);
다 이럴 때는 블럭이 수행되지 않는다 
*/