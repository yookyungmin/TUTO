package practicc2;


class Car{
	String color; // 색상
	String gearType; // 변속기 종류 - auto자동 manual수동
	int door;

	Car() { //
	this("white", "auto", 4); //Car(String color, String gearType, int door) 호출
	} //매개변수 지정 없으면 기본값

	Car(String b) { 
	this(b, "auto", 4);
	}
	
	Car(String c, String g){
		this(c, g, 4);
	}
	Car(String c, String g, int d) {
	color = c;
	gearType = g;
	door = d;
	}  // this()생성자 쓸라면 매개변수 있는 생성자가 있어야댐
	/*this이용한 생성자 호출을 할일이 생성자 오버로드 할때 말곤 없지요*/
}
/*
 *Car(String g){
 *this("blue", g, 4); //두번째 기어타입에해당건만 변경
 *}
 */
	class CarTest2{
	
	public static void main(String[] args) {

	Car c1 = new Car();
	Car c2 = new Car("blue");
	Car c3 = new Car("black", "manual"); // 객체생성시 매개변수 개수 선택은 생성자에 지정된 매개변수 개수에 따라 선택가능

	System.out.println("c1의 color= " +c1.color+ ", gearType= " +c1.gearType+", door = "+c1.door);
	System.out.println("c2의 color ="+c2.color+", gearType= "+c2.gearType+", door = "+c2.door);
	System.out.println("C3의 color="+c3.color+",gearType="+c3.gearType+", door = "+c3.door);
}
}
	/*
	package practicc2;


	class Car{
		String color; // 색상
		String gearType; // 변속기 종류 - auto자동 manual수동
		int door;

		Car() { //
		this("white", "auto", 4); //Car(String color, String gearType, int door) 호출
		}

		Car(String color) { 
		this(color, "auto", 4);
		}
		
		Car(String c, String g){
			this(c, g, 4);
		}
		Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		}
	}

	
	 //*Car(String g){
	 //*this("blue", g, 4); //두번째 기어타입에해당건만 변경
	 //*}
	 
		class CarTest2{
		
		public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car("blue");
		Car c3 = new Car("black", "manual");

		System.out.println("c1의 color= " +c1.color+ ", gearType= " +c1.gearType+", door = "+c1.door);
		System.out.println("c2의 color ="+c2.color+", gearType= "+c2.gearType+", door = "+c2.door);
		System.out.println("C3의 color="+c3.color+",gearType="+c3.color+", door = "+c3.door);
	}
	}
		*/