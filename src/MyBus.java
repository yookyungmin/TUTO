import java.util.*;
import java.lang.*;
import java.io.*;

abstract class Car {
	public void CurrentState () {
		System.out.println("움직이고 있습니다.");
	}
}

class Bus extends Car {
	String color;
	public void Color (String colorString) {
		System.out.println("버스는"+color+"입니다.");
}
}
	public class MyBus{
		


	public static void main(String[] args) {
		Bus bus = new Bus();
	    bus.Color("초록색");
		bus.CurrentState();

	}

}
