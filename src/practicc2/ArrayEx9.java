package practicc2;

import java.util.*; // Arrays.toString을 사용하기 위해 추가
public class ArrayEx9 {

	public static void main(String[] args) {
/*for(int i = 0; i<arr.length; i++){
 	arr[i] = (int)(Math.random()*5);
 } 
	}*  // 배열을 연속적인 범위의 임의의 값을 채우는법*/
		
		int[] code = {-4, -1, 3,6,11}; //불연속적인 캆드로 구성
		int[] arr=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp =(int)(Math.random()*code.length); 
			//소숫점 버리기 위해(int)형변환 
			//arr[i] i 가 1씩 커지니깐 그 만큼 생긴 배열안에 code 안에 있는 수들을 램덤으로 넣어주는
			
			arr[i] = code[tmp];
			
		}
			System.out.println(Arrays.toString(arr));
		
		

	}

}
