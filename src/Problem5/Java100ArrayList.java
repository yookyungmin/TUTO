package Problem5;

import java.util.ArrayList;

//컬렉션 프레임워크의 arrayList 를 사용예제
//

class Person{
	
}
public class Java100ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//먼저 자바 배열은 크기를 미리 지정하고 사용, > 그러다 보니 넉ㄴ거하게 크기를 지정해놓고 사용하곤한다
		//반면, ArrayList는 필요시 언제든지 추가, 삭제 가능.
		// List 인터페이스를 상속하므로 인덱스가 있고, 저장순서 유지, 데이터 중복이가능
		//또한 제네릭 문법을 사용할수 있다.>> 만약 제네릭을 사용 하지 않는다면 내부적으로 " OBJECT타입으로 처리된다.
		//사용을 위해서는 상단에 import java.util.ArrayList; 또는 import java.util.*; 
		
		
		//[1] ArrayList를 제네릭이 아닌, object 타입으로 사용하는 경우 !!!!
		ArrayList list1 = new ArrayList();
		
		//[2] 데이터추가
		list1.add("홍길동"); //문자열 자료형저장
		list1.add(20); // 정수 자료형 저장'
		list1.add("이순신");
		list1.add(20); //데이터 중복이 가능
		list1.add(new Person()); //object 타입일떈  받아줌 

		//[3] 데이터 가져오기 -->get()--> 이떄, 해당 데이터 자료형으로 형변환 하여 사용한다.
//		System.out.println(list1.get(0)); //홍길동
		String str =(String)list1.get(0);
		int num = (int)list1.get(0); // 형변환이 잘못되서 에러
//		list1.get(0);
		
		
//		//[3] 데이터 가져오기 -->get()--> 이떄, 해당 데이터 자료형으로 형변환 하여 사용한다.
////		System.out.println(list1.get(0)); //홍길동
////		String str = list1.get(0); //Object cannot be converted to String 에러, 아래처럼 형변환해서 사용
//		String str = (String)list1.get(0);
//		System.out.println(str.length()); //길이3
//		
//		int num = (int)list1.get(1);
//		System.out.println(num+100);
//		
//		//[!] 결론
//		//이상으로 봤을떄, 제네릭 문법을 사용하지않으면 ArrayList는 내부적으로 Object 타입으로 처리됨으 알수 있다
//		//이렇게 get()메서드를 사용할떈 형변환 주의
//		//제네릭을 사용하면된다
//		//[4] 출력>반복문 > 배열의 크기 >객체명.size()
//		System.out.println(list1.size());//5
//		for(int i = 0; i<list1.size(); i++)
//			System.out.println(list1.get(i)+ " ");

	}

}
