package Problem5;
import java.util.*;
class LandAnimal { public  void crying() {System.out.println("육지동물"); }}

class Cat extends LandAnimal { public void crying() { System.out.println("냐옹냐옹");}}
class Dog extends LandAnimal { public void crying() {System.out.println("멍멍");}}
class Sparrow {public void crying() {System.out.println("짹쨱");}}

class AnimalList<T> {
	ArrayList<T> al = new ArrayList<T>();
	
	void add(T animal) { 
	al.add(animal);
}

	T get(int index) {return al.get(index); }
	boolean remove(T animal) {return al.remove(animal); }

	int size() {return al.size();}
}

public class Generic01{
	public static void main(String[] args) {
	AnimalList<LandAnimal> landAnimal = new AnimalList<>(); //1.7부터 생략가능

	landAnimal.add(new LandAnimal());
	landAnimal.add(new Cat());
	landAnimal.add(new Dog());
	
	for(int i = 0; i<landAnimal.size();i++) {
		landAnimal.get(i).crying();
	}
}
}

