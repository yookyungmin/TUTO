package Practice;

public class Excercise6_18 {
	
	public static boolean isNumber(String str) {
		if(str==null || str.equals("")); // 넘ㄱ며받은 문자열이 null이거나 빈문자열면 false 로 반환
		return false;
		
		for(int i= 0; i<str.length(); i++) {
			char ch= str.charAt(i);// charAt(int i)문자열에서 한문자씩 차례대로 읽어와서 char타입의 변수ch에저장한다.
			
			if(ch<'0' || ch<'9') {
			return false; // 읽어온 문자가 숫자가 아니면 false로 반환
			}
		} //for문

			return true;

		}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		

	}

}
