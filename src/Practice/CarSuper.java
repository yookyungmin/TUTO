package Practice;
//(2) 또, 부모 클래스에 기본 생성자가 없는 경우, 즉, 파라미터가 없는 생성자가 없는 경우, 자식 클래스에서 반드시 직접 (코드로 써서)
//부모 클래스의 생성자 호출을 시켜주어야 합니다.
//메소드 오버로딩 조건 =생성자 오버로딩 메소드이름 동일,매개변수값은달라야함
//생성자가 하나도 없다면 기본생성자가 자동으로 생김 
//상속받는클래스에 생성자가 없어서 기본생성자가 생기면super();생략되어나오는데 조상클래스에서도 기본생성자가 있어야한다or매개변수가없는생성자가있어야함
/*[코딩초보] [오후 11:26] 상속받는 클래스에서 기본생성자가 있다면 부모클래스에 매개변수가 없는 생성자(기본값=같은클래스에서 다른생성자를호출한)
 * or기본생성자가 있어야한다
 * 
 * */
class Car {
    private String name;
    private int speed;
    
    Car(){
    	this("sonata", 50); //같은클래스의 다른생성자 호출/기본값
    } 
    
//    Car(){}//부모클래스에서 기본생성자를 추가하는게 정신건강에 좋음

    public Car(String n, int s) {
        name = n;
        speed = s;
    }
    
    public String toString() {
        return "name: " + name + ", speed: " + speed;
    }
}

class SportsCar extends Car {
    private String color;


    public SportsCar() {
    	//super(); 생략되어이있음 //조상클래스의 기본생성자or매개변수가 없는 생성자(기본값) 있어야함
    }
//    public SportsCar() {
//        super("Unkown", 150); //조상클래스의 생성자
//    } //기본값
    
    public SportsCar(String n, int s, String c) {
        super(n, s);
        color = c;
    }
    
    public String toString() {
        return super.toString() + ", color: " + color;
    }
}


public class CarSuper
{
   public static void main(String[] args) {
       SportsCar car = new SportsCar("포르쉐", 200, "RED");
       SportsCar car2 = new SportsCar();
       Car c = new Car();
       
      System.out.println(car);
      System.out.println(car2);
      System.out.println(c);
   }
}