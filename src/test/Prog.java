package test;



class Car{
	
	private String modelName; //모델명
	private int modelYear; //연식
	private String Color; //컬러
	private int maxSpeed; //최고 속도
	private int currentSpeed; // 현재속도
	
	Car() { //기본생성자
		this.modelName = "소나타";
		this.modelYear = 2010;
	}
	
	Car(String modelName, int modelYear, String Color, int maxSpeed ){
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.Color = Color;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}
	
	public String getModel() {
		return this.modelYear + " 연식 " + this.modelName + " 색상 = " + this.Color + " 최고 속도 " +this.maxSpeed;
	}
	
}

public class Prog {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car myCar2 = new Car("그렌저", 2019, "검정", 100);
		System.out.println(myCar.getModel());
		System.out.println(myCar2.getModel());

	}

}
