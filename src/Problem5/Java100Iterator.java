package Problem5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.print.attribute.HashAttributeSet;

public class Java100Iterator {
		public static void main(String[] args) {
				//[1]객체생성
			ArrayList<String> list = new ArrayList<String>();
			
			//[2]요소추가add
			list.add("Alligator");
			list.add("Hippo");
			list.add("Ostrich");
			list.add("Donkey");
			
			//[3]Iterator (반복자)객체 생성 객체생성 과정도 중요
			//System.out.println(hasNext()); // 에
			//Collection 인터페이스 > Iterator()정의하고 있고 이를 상속받는게 List, Set 인터페이스이모
			//List, Set 인터페이스를 상속받아 구현한 클래스들 객체를 통해서 Iterator()메서드를 사용할수 있음
			
			Iterator<String> iter = list.iterator();
			
			//[4] Iterator (반복자)메서드사용 --> hasNext(), next(), remove()
//			System.out.println(iter.hasNext()); //true // 첫번째요소 악어
//			System.out.println(iter.next()); //Alligator 
//			System.out.println(iter.hasNext());  //true  //두번쨰 요소 하마
//			System.out.println(iter.next()); // Hippo
//			System.out.println(iter.hasNext()); //true  //세번쨰 요소 타조
//			System.out.println(iter.next()); //Ostrich
//			System.out.println(iter.hasNext());//true //네번쨰 요소 당나기
//			System.out.println(iter.next()); //Donkey
//			System.out.println(iter.hasNext()); //false  
//			System.out.println(iter.next()); //Err
			//주석제거하면 아래 while문 출력안됨
			
			//향상도니 for문 요소 출력
			for(String s:list) {
				System.out.println(s);
			}
			
			
			
				//[6] 요소 출력 while
				//문제속의 문제 1--> 배열 요소 전체를 출력해보시오
				//문제속의 문제 2아래 출력 결과를 예상하여 말해보시오?
				//문제속의 문제	3 Hippo 요소만 출력
				//문제속의 문제 4 Hippo만 삭제
				System.out.println("------------------Iterator 반복자로 출력");
				
				
				
//				while(iter.hasNext()) { //값있는지 구분 true
//					System.out.println(iter.next()); 
//				}//배열요소 전체출력  (1)
				
				
				
//				while(iter.hasNext()) { //값있는지 구분 true
//			
//					String str = iter.next();  //
//						if("Hippo".equals(str)) {
//						System.out.println(str);  
//					}
//				}//Hippo 요소만 출력    (2)

				while(iter.hasNext()) {
					String str = iter.next();
					if("Hippo".equals(str)) {
						iter.remove(); //Hippo 삭제
						System.out.println("하마삭제"); //if문 두줄이상일떈 { 쓰기
					}
				}
			
				System.out.println("------------------Iterator 반복자로 출력");
				
				for(String s:list) {
					System.out.println(s); //Hippo삭제 후 출력
					
				}
			}
		}
		

