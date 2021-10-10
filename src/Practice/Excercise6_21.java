/*
  메서드명 : abs
기 능 주어진 값의 절대값을 반환한다 : .
반환타입 : int
매개변수 : int value

 */
package Practice;

class Excercise6_21{

	public static int abs(int value) {
	return value>=0? value: -value; // value값이 양수이면 그대로 반환하고 음수이면 부호를 바꿔서 반환 / 삼항연산자

}
	public static void main(String[] args) {
	int value = 5;
	System.out.println(value+"의 절대값:"+abs(value));
	value = -10;
	System.out.println(value+"의 절대값:"+abs(value));

}
}

/*/if문일때 
	public static int abs(int value) {
	if(value>=0){
	return value;
	}else {
	return -value;// value 가 음수인경우 부호를 변경
}
}


*/