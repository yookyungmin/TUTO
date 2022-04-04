package Problem5;
import java.util.ArrayList;



class Fruit implements Eatable {public String toString( ) {return "Fruit";}}
class Apple extends Fruit {public String toStirng( ) {return "APPLE";}}

class Grape extends Fruit {public String toString() { return "Grape";}} 

class Toy { public String toString() {return "TOY";}}

interface Eatable{}

public class FruitBoxEx2 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();

	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{} 

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
}