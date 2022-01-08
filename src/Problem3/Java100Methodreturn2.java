package Problem3;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

//반환값이 2개 있는 메서드를 구현 메서드는 ("korea", "USA") 입력시 소문자는 대문자로 대문자는 소문자로 출력구현
//리턴된느 반환값이 2개일떄 처리
public class Java100Methodreturn2 {
	
//	public static void capitalMethod(String a, String b) { //소문자 > 대문자 ,, 대문자 >> 소문자
//		String a_ =a.toUpperCase();
//		String b_=b.toLowerCase();
//	
//		System.out.println(a_);
//		System.out.println(b_);
//	}
//		public static void main(String[] args){
//			

//			capitalMethod("korea", "USA");
//		}
//} Korea usa 출력

	
//	public static String[] capitalMethod(String a, String b) { //소문자 > 대문자 ,, 대문자 >> 소문자
//	String a_ =a.toUpperCase();
//	String b_=b.toLowerCase();
//
//	//리턴값 2개를 저장할 배열변수선언
//	String[] ret = {a_, b_};
//	return ret;
//}
//	public static void main(String[] args){
//		
//		
//		String[] result =capitalMethod("korea", "USA");
//		
//		//[2]출력
//		System.out.println(result); //주소값출력[Ljava.lang.String;@19e0bfd
//		System.out.println(Arrays.toString(result));//[KOREA, usa]
//	}
//}
	
//toString() 과 같은 경우 nul 값을 넣으면 nullPointerException(NPE)발생시키지만 valueOf sms "null" 이란 문자열로처리
	
		public static void main(String[] args){
			String input = " ";
			String output= " ";
			char tmp;
			Scanner sc = new Scanner(System.in);
			System.out.println("문자열을 입력하세요");
			
			input = sc.nextLine();
			for(int i =0; i<input.length(); i++) { //문자열을 검사하기 위해서 input의 길이만큼 반복문실행 (한글자씩 tmp에 옮겨서 검사
				tmp=input.charAt(i); //스캐너는 String 타입으로밖에 못받는데 String 으로 저장된 문자열중에서 한글자만 선택해 char타입으로 변환
				if((65<=tmp)&&(tmp<=90)) { //문자가 65<=tmp <= 90인경우 (대문자인경우)
					 output+= input.valueOf(tmp).toLowerCase(); // 내장함수를이용해서 소문자로 변환 valueOf= string 객체로 변환ㅑ
				}else if((97<=tmp)&&(tmp<=122)) { //문자가 97<=tmp<=122 소문자인경우
					output += input.valueOf(tmp).toUpperCase(); //내장함수를 이용해서 대문자로 변환
					
				}else { // 그외 문자일 경우
					output+=(char)tmp; //그대로 넣는다.
				}
			}
				System.out.println("변환된 문자열"+output); //최종적으로 변환된 글자열만output 출력
		}
	}