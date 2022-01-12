package Problem4;
//다형성을 사용하면 배열이나 매개변수 활용해서 좋다는데 자세히코드를 설명하시오

import java.util.concurrent.CopyOnWriteArrayList;

class Personn{
	
}

class Batman extends Personn{
	
}

class Human{}
class Superman extends Human{}

public class Java100Poly6 {

	public static void main(String[] args) {
		
	//[1] 배열에서 다형성을 사용할수 없다면
	//배열 >> 동일한 타입의 데이터를 하나로 묶어서 관리하는 자료구조>>다형성이 없다면 객체벼로 관리를해야한다.
		Personn[] persons = new Personn[10]; // Person 전용
		persons[0] = new Personn();
		persons[1] = new Personn();
		persons[2] = new Batman(); 	//에러x 
		Batman[] batmans = new Batman[10]; //Batman 전용
		batmans[0] = new Batman();
		batmans[1] = new Batman();
//		batmans[2] = new Person(); //에러 자손타입으로 부모타입 못받음
		//[2] 배열에서 다형성을 사용할수 있기에 장점
			Human[] humans = new Human[10];
			humans[0] = new Human();
			humans[1] = new Superman();
	
			
		//[3] 매개변수의 다형성
			//프로그래밍 언어에서 함수나 메서드를 호출할떄는 그에 맞는 적절한 파라미터를 보내줘야한다
			//System.out.println()메서드 경우 어떤타입, 객체를 매개변수로 받더라도 에러없이 해당객체 출력
			//가능한이유 바로 다형성을 활용하고있기때문에
			//실제 메서드의 API를 보면 > public void println(Object x) 로 되어있기에 어떤 객체 타입이 전달되더라도 에러없이 출력가능
			//object 가장최상위 어떤 객체를 보내도 그보다상위 타입이된다
			System.out.println(persons[2]);
			System.out.println(new Person());
			System.out.println(new Person());//Problem4.Person@1db9742
			System.out.println(new Batman()); //Problem4.Batman@106d69c
	}

}
