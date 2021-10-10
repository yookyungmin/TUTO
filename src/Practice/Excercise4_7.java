package Practice;
class Excercise4_7{
	public static void main(String[] args){
	String str = "12345"; // 문자열 12345를가진 str
	
	int sum =0 ; // 각자리의 합을 더한 결과를 출력하는 코드를 완성

	for(int i=0; i<str.length()
			; i++){// 각자리의 합을더한
	sum+=str.charAt(i)-'0'; //문자열을 숫자로 바꾸기위해 '0'
	
}

	System.out.println("sum="+sum);
	System.out.println(Math.round(33.777*100)/100.0);
	//수점 둘째 자리까지 나타내고싶으시면 100.0을 곱하였다가 나눠주시면 되고 소수점 셋째 자리까지 나타내고싶으시면 1000.0을 곱하였다가 나눠주면 됩니다. 
	//(참고로 반올림이 아닌 올림을 하고싶다면 Math.ceil(); 버림은 Math.floor();입니다.)
}
	
}


//charAt(int i) 메서드는 문자열에서 i번째 문자를 반환한다.i의 값은 0부터 시작
/*charAt(int i)을 이용해서 반복문으로 각 문자열의 문자를 하나씩 읽어서 숫자로 변환한
다음 에 계속 더하면 된다 문자 을 숫자 로 바꾸는 방법은 문자 에서 문자 을 sum . '3' 3 '3' '0'
빼주는 것이다 알파벳이나 숫자는 문자코드가 연속적으로 할당되었기 때문에 이런 방법 .
이 가능하다.*/

