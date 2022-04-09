package Problem5;

import org.omg.CORBA.PUBLIC_MEMBER;

import practicc2.if_1;

//1. 불연속적인 열거형 상수의 경우 원하는 값을 괄호()안에 적는다
//괄호()를 사용하려면 인스턴스 변수와 생성자를 새로추가해줘야한다
//열거형의 생성자는 묵시적으로 private이므로 외부에서 객체 생성불가
enum Direction2 {
		EAST(1, ">"), SOUTH(2,"V"), WEST(3, "<"), MORTH(4, "^");
	

		private static final Direction2[] DIR_ARR = Direction2.values();
		private final int value;
		private final String symbol;
		
		private Direction2(int value, String symbol) {
			this.value =value;
			this.symbol = symbol;
			}
		public int getValue() {return value;}
		public String getSymbol() {return symbol;}
		
		public static Direction2 of(int dir) { //of 메서드를통해 상수들 중 하나를 얻어온다
			if(dir <1 || dir>4) // 0~3의 범위 벗어나면 예외발생
				throw new IllegalArgumentException("invalid value:"+dir);
			return DIR_ARR[dir-1];
			
		}
			
			// 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전한다.
			public Direction2 rotate(int num) {
				num = num % 4;

				if(num < 0) num +=4; // num이 음수일 때는 시계반대 방향으로 회전 

				return DIR_ARR[(value-1+num) % 4];
			}

			public String toString() {
				return name()+getSymbol();
			}
		}

public class EnumEx12_6 {
	public static void main(String[] trgs) {
		for(Direction2 d:Direction2.values())
		System.out.printf("%s=%d\n", d.name(), d.getValue());
		
		Direction2 d1 = Direction2.EAST;
		Direction2 d2= Direction2.of(1);

		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));
	}
}
