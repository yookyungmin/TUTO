package Practice;
//문장들을 조건식으로 표현
public class Excercise4_1 {

	public static void main(String[] args) {
		// int형 변수 x가 10보다 크고 20보다 작을때 true 인조건식
		// 10 < x && x< 20
		
		//char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		// !(ch == ' ' || ch == '\t') 또는 ch!==' ' || ch! == '\t'
		
		//char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		// (ch == 'x' || ch == 'X')
		//char 형 변수 ch가 숫자 ('0' ~ '9')일때 true 조건식
		//'0'<ch || ch <= '9'
		//char 형 변수 ch가영문자 (대문자 또는 소문자)일때 true 인조건식
		//('a' <=ch && ch <= 'z') ||('A' <= ch && ch <= 'Z')  
		//('a' <=ch && ch <= 'z') ||('A' <= ch && ch <= 'Z');
	}

}
