package creature;
public abstract class Creature{
	private int x;
	private int y;
	private int age;
	
	Creature(int x, int y, int age){
		this.x = x;
		this.y = y;
		this.age = age;
	}  //생성자
	public void age() {
		age++;
		} //생명체 라면 나이를 먹어서 공통,

	public void move(int xDistance) {
	x+= xDistance; // x= x+ xDistance
	} //x좌표상으로 이동할 수 있는 부분이 공통적인 기능 일반메서드
	
	public int getX() { return x;}
	public void setX(int x) {this.x = x;}
	
	public int getY() {return y;}
	public void setY(int y) { this.y= y;}  //게터 세터
	
	public abstract void attack(); //추상메서드, 공격 기능
	public abstract void printInfo(); //추상메서드 기능과 정보를 출력하는기능
	
	
	public String toString() {
		return "x: "+x+", y:" +y+ ", age="+age;
		}
}	