package Problem5;

import java.util.ArrayList;
import java.util.Arrays;
//2차원배열
public class Java100ArrayList3 {

	public static void main(String[] args) {
	
		//[1]객체생성
		ArrayList<Integer[]> arr = new ArrayList<Integer[]>();
		
		//[요소추가 add()
		arr.add(new Integer[] {11,12,13,14});   //첫번째 요소값
		arr.add(new Integer[] {21, 22, 23, 24});
		arr.add(new Integer[] {31, 32, 33,34,35});
		arr.add(new Integer[] {41,42,43,44});
		

			for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i)[0]);  //11(0번째 배열의 첫번째 값), 21(1번째 배열의 첫번쨰 값,), 31(2번째 배열의첫번쨰값)  
		}
	
			
			//[4] 전체 요소출력 이중반복문 그런데 안쪽 배열의 사이즈를 미리 체크-->여기서 약간 주의!
			
//			System.out.println(arr.get(0).size()); 		//size() 컬렉션프레임워크 타입의 길이를 알고자할떄
//			System.out.println(arr.get(0).length(); // 문자열 길이 알고 싶을때
			System.out.println("===========");
			System.out.println(arr.get(1).length); //4  //배열길이를 알고싶을때 int[] Integer[] String[]
			System.out.println(arr.get(2).length); //5
			
			//[5] 전체요수 출력
			// ,, 바깥쪽 for문 size 안쪽for문 길이 length
			System.out.println("--------------");
			
			for(int i=0; i<arr.size(); i++) {
				for(int j =0; j<arr.get(i).length; j++) {
					System.out.print(arr.get(i)[j]+" ")
					;
				}
				System.out.println();
			}
			System.out.println("==========");
		
	
	}

}
