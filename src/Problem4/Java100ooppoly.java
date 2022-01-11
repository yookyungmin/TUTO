package Problem4;



//abstract class Car{
//	abstract void run();
//}
//
//class Ambulance extends Car {
//	
//		void run() {
//			System.out.println("앰뷸런스 지나가요 삐뽀삡뽀삐뽀");
//		}
//}
//
//class Cutivator extends Car{
//	void run() {
//		System.out.println("경운기 지나가요 덜컹덜컹~");
//	}
//}
//
//class SportsCar extends Car{
//	void run() {
//		System.out.println("스포츠카 지나가요 씽 ~ 부우우웅~");
//	}
//}
//
//public class Java100ooppoly {
//
//	public static void main(String[] args) {
//		//[1] 객체생성
//		Car c1 = new Ambulance();
//		Car c2 = new Cutivator();
//		Car c3 = new SportsCar();
//		
//		//run 메서드 호출
//		c1.run();
//		c2.run();
//		c3.run();
//			
//	}


// 다형성을 화룡한 객체 생성시 배열과 반복분을 사용하여 객체를 생성, 향상된 for문 사용
abstract class Car{
	abstract void run();
}

class Ambulance extends Car {
	
		void run() {
			System.out.println("앰뷸런스 지나가요 삐뽀삡뽀삐뽀");
		}
}

class Cutivator extends Car{
	void run() {
		System.out.println("경운기 지나가요 덜컹덜컹~");
	}
}

class SportsCar extends Car{
	void run() {
		System.out.println("스포츠카 지나가요 씽 ~ 부우우웅~");
	}
}

public class Java100ooppoly {

	public static void main(String[] args) {
		
		//배열 길이가 3인 객체생성
//		Car[] cars = new Car[3];
//		System.out.println(cars[0]); // null 각 배열에는 아직 null값만 존재
//			cars  = new Car[] {new Ambulance(), new Cutivator(), new SportsCar()}; //초기화
		
		
		//[2]1번 방법 말고 - 자식클래스로 객체생성 - 타입은 부모타입으로 - 이렇게 생성된 객체들로 바로 초기화- 다형성덕분
			
			Car[] cars = {new Ambulance(), new Cutivator(), new SportsCar()}; //생성과 초기화
//			
//			System.out.println(cars[0]);
//			System.out.println(cars[1]);
//			System.out.println(cars[2]); // 주소값만 출력
			
			//반복문 돌면서 각 객체의 run() 메서드 호출
			for(int i =0; i<cars.length; i++) {
				
				cars[i].run(); //
//				cars[2].run();
				System.out.println(cars[i]);
	
			}
			//향상된 for문
			System.out.println("================");  // 향상된for문 배열변수만 가능
			for(Car obj:cars) {
				System.out.println(obj);
				obj.run();
			}
		}

			
	}



