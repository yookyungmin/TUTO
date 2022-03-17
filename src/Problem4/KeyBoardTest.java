package Problem4;
class KeyBoard{

private String model;
private int price;

KeyBoard(){}
KeyBoard(String model, int price){
	this.model =  model;
	this.price = price;
	}

public KeyBoard(String model) {
        this.model=model;
    }
    
    public KeyBoard(int price) {
        this.price=price;
    }

public String getModel() {return model;}
public void setModel(String model) { this.model = model;}

public int getPrice() {return price;}
public void setPrice(int price) { this.price = price;}

public String printKey(){
    return  this.model+ "이름은" + price+"원입니다";
    }
public void printkeyy() {
	System.out.println(getModel()+"이름은요"+ price+" 원 입니다");
}
}

public class KeyBoardTest{
	public static void main(String[] args) {
	KeyBoard k = new KeyBoard("B100", 5000);
	KeyBoard k2 = new KeyBoard(50000);
	
	k.printkeyy();
	System.out.println(k.printKey());
	
	System.out.println(k2.printKey());


	KeyBoard k3 = new KeyBoard(); //기본생성자가 있어야함
	k3.setModel("모델1");
	k3.setPrice(10000);
	k3.printkeyy();
	System.out.println(k3.getModel()+k3.getPrice());

	KeyBoard k4 = new KeyBoard();
	k4.setModel("테슬라");
	k4.setPrice(50000);
	
	System.out.println(k4.printKey());
	
}
};