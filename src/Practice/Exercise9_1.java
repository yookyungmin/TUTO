package Practice;



public class Exercise9_1 {

	public static void main(String[] args) {
		SutdaCardd c1 = new SutdaCardd(3, true);
		SutdaCardd c2 = new SutdaCardd(3, true);
		
		System.out.println("c1="+c1.toString()); 
		System.out.println("c2="+c2);//toString 을 직접 호출하지 않아도 어떤 객체를 Syso 호출하면 자동으로 toString이 호출되도록 약속되어있다.
		System.out.println("c1.equals(c2)"+c1.equals(c2));

	}

}

class SutdaCardd{
	int num;
	boolean isKwang;
	
	SutdaCardd(){
	this(1, true);
	}
	SutdaCardd(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {//매개변수가 Object타입이르모 어떤 타입의 인스턴스도 매개변수로 가능하다 그래서 반드시 
		if(obj instanceof SutdaCardd) { //instanceOf로 확인후에 형변환해서 멤버변수 num과 isKwang의 값을 비교해야한다.
			SutdaCardd c = (SutdaCardd)obj;
			return num==c.num && isKwang==c.isKwang;
		}
		return false;
	}
	public String toString() {
		return num+(isKwang ? "K":"");
	}
}