package Practice;


//메서드명 contains
//첫번째 문자열(src)에 두번째 문자열(target) 이포함되어 있는지 확인한다
//포함이 되어 있ㅇ면 true, 그렇지 않으면false로 반환한다.
//반환타입 boolean
//매개변수 String src, String target
//hint String클래스의 indexOf()를 사용할것

class Exercise9_4{
	public static boolean contains(String src, String target) {
	return src.indexOf(target)!= -1;// src에서 target의 위치를 찾아서 반환 찾지 못하면 -1 반환
	}

	public static void main(String[] args) {
	System.out.println(contains("12345", "23"));
	System.out.println(contains("12345", "67"));
}
}