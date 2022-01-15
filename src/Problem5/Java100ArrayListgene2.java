package Problem5;

import java.io.InterruptedIOException;
import java.util.ArrayList;

public class Java100ArrayListgene2 {
	public static void main(String[] args) {
		//ArrayList 제네릭사용
		ArrayList<String> ar = new ArrayList<String>();
		
		//[1]추가 add
		ar.add("홍길동");
		ar.add("이순신");
		ar.add("강감찬");
		ar.add("을지문덕");
		ar.add("김유신");
		System.out.println(ar.get(3));
		String str = ar.get(0); //형변환 없이 바로사용 타입안정성 높아짐
//		int str = (int)ar.get(0); //컴파일 단계에서 오류발견
		
		
		
		//[3] 수정 -->set (인덱스 수정값
		ar.set(3, "징기스칸");
		System.out.println(ar.get(3));
		
		//[4] 삭제 -- > 2가지(하나만 삭제, 한꺼번에 삭제)-->remove (인덱스) 하나만삭제
		ar.remove(3);
		System.out.println("--------------삭제 후출력");
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		System.out.println(ar.get(3)); //징기스칸 제거 되고 김유신
		System.out.println("======삭제 후 출력");
		
		
		//[4] 출력 향상된 for문
		for(String str1:ar)
			System.out.print(str1);
		System.out.println();
		
		//[5] 출력2
		for(int i =0; i<ar.size(); i++) {
//			System.out.println(ar.get(i));
			System.out.printf("%d번 학생의 이름은 %s입니다\n",(i+1),ar.get(i));
		}
			//[6] 한꺼번에 삭제 -->removeAll(배열명)
			ar.removeAll(ar);
			System.out.println(ar.size()); // 0 , size = 요소의 개수 전부다 삭제했으니 0
			
			System.out.println("------------전체 삭제 후 출력");
			for(String str2 :ar)
				System.out.println(str2);
			System.out.println("---------전체삭제후 출력");
		
	}
}
