package test;
class Field {
		static int classVar = 10; //클래스 변수 선언
		int instanceVar = 20; //인스턴스 변수 선언
	Field(){}
	Field(int num1) {
			System.out.println(num1);
	}
	
	
}

	public class Filed2 {
		public static void main(String[] args) {	
			Field func = new Field(1);
				
				int var = 30; //지역변수선언
			System.out.println(var+"\n");
			Field myField1 = new Field(); // 인스턴스 생성
			Field myField2 = new Field(); //인스턴스 생성

			System.out.println(Field.classVar); //클래스 변수 참조
			System.out.println(myField1.classVar);
			System.out.println(myField2.classVar + "\n"); 
				
			myField1.classVar=100; //클래스 변수 값을 변경

			System.out.println(Field.classVar);//클래스 변수 참조
			System.out.println(myField1.classVar);
			System.out.println(myField2.classVar+ "\n");

			System.out.println(myField1.instanceVar); //인스턴스 변수 참조
			System.out.println(myField2.instanceVar + "\n");

			myField1.instanceVar = 200;	// 인스턴스 변수의 값을 변경

			System.out.println(myField1.instanceVar);// 인스턴스 변수 참조
			System.out.println(myField2.instanceVar);
			//클래스 변수는 모든 인스턴스 변수의 값을 공유 모두 변경
			//인스턴스 변수는 각 인스턴스마다 고유의 값
	}

		
		
}
	
	
 