package Practice;

class Mypoint{
	int x; // 인스턴스 변수
	int y;  //인스턴스 변수
		Mypoint(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		double getDistance(int x1, int y1) {
			return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); // x, y는 인스턴스변수
		}
}

public class Excercise6_6 {

	public static void main(String[] args) {
		Mypoint p = new Mypoint(1, 1);
		
		//p와 (2,2)거리를 구한다.
		System.out.println(p.getDistance(3, 3));
	}

}
