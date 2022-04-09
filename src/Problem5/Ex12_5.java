package Problem5;

import javax.annotation.processing.AbstractProcessor;

//               0       1    2     3   
enum Direction {EAST, SOUTH, WEST, NORTH} //하나하나 객체 


public class Ex12_5 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST; //EAST로 초기화(저장) 열거형타입.상수이름
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class , "EAST"); //Enum = 모든 열거형 최고조상
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		
		System.out.println("d1==d2 ? "+ (d1==d2)); //false
		System.out.println("d1==d3 ? "+ (d1==d3)); //true
		System.out.println("d1.equals.(d3) ?"+d1.equals(3)); //true //하나하나 객체라 equals로 비교가능
		//System.out.println("d2>d3 ? "+(d1>d3)); //비교연산자 불가
		System.out.println("d1.compareTo(d3 ? "+(d1.compareTo(d3)) ); //0 
		System.out.println("d1.compareTo(d2-2) ? "+(d1.compareTo(d2))); 

		
		switch (d1) {
		case EAST: //Direction.EAST라고 쓸수 없다.
				System.out.println("The direction is EAST");
			break;
		case SOUTH: 
			System.out.println("The direction is SOUTH"); //break;
		case WEST:
			System.out.println("The direction is WEST"); break;
		case  NORTH:
			System.out.println("The direction is NORTH"); break;
		default:
			break;
		}
		Direction[] dArr = Direction.values();//열거형의 모든 상수를 배열로 반환
		for(Direction d: dArr) //for D
			System.out.printf("%s=%d%n", d.name(), d.ordinal()); //ordinnal 순서
	}

}
