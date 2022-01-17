 package Problem5;

import java.util.ArrayList;
import java.util.Iterator;
//컬렉션 프레임 워크를 쓸때 한번 이상은 만나는 메시지 java.util.ConcurrentModificationException
// list 요소를 반복문 안에서 돌리면서 값을 삭제하고자 할때
 //보통 반복문안에서 remove() 메서드를 호출시 발생
//그외에도 Iterator(반복자)객체의 생성 순서에 따라서도 발생 아무튼다양
 
 
//한행씩 삭제하는 경우에는 별문제 없으나 반복문 안에서 순회하면서 삭제시에
//반복문 들어가기전의 기존 list 배열의 size(length)나 index 정보등이 변경되면서 >>순회시 정보가 맞지 않아 오류가 발생
 //이를 해결하기 위해서는 Iterator를 반복자를 사용하여 순회 Iter.remove()메서드로 처리해야한다.
 
public class Java100Iterator2 {
	
	public static void main(String[] args) {
		//[1]객체 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//[2]요소추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//[3] 객체 Iterator 반복자 객체생성
		Iterator<Integer> iter = list.iterator();
		
		//[4]출력 -- 요소 삭제전
		for(Integer num:list) {
			System.out.print(num);
			}
		System.out.println();

		//[5-1] 요소삭제 반복문 없이 한개요소만 삭제
		System.out.println(list.get(1));//2
		list.remove(1); //2번삭제
		System.out.println(list.get(1));//3 
		
		//[5-2] 요소 삭제 while 반복문 사용
	
				
				System.out.println();
		
	}

}
