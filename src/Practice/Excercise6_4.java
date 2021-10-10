package Practice;
class Excercise6_4{
	//두 점 (x, y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
	return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); // x, y는 지역변수
	//static을 사용하여 인스턴변수사용불가
}

public static void main(String args[]) {
System.out.println(getDistance(1,1,2,2));
}

}