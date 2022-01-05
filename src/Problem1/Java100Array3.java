package Problem1;

import java.util.Arrays;

public class Java100Array3 {

		public static void main(String[] args) {
			
		
			//[1] 변수선언
			int[] ar = {12, 14, 25, 39, 54};
			
			double[] ar2 =  {1.54, 2.87, 8.89, 65.8};
			
			//[2] 마지막 배열 요소 값 출력
				System.out.println(ar[ar.length-1]);  // 길이에서 -1 마지막 숫자
				
				System.out.println(ar[3]);
				System.out.println(ar2[3]);
				
				//[3] 배열명 자체를 찍어서 출력 주소(참조) I정수형 D 실수형
				System.out.println(ar); // 주소값으로 출력 [I@19e0bfd
				System.out.println(ar2); //[D@139a55 
				System.out.println(Arrays.toString(ar)); // [] 값으로 출력
				
				
				//[4]for 반복문
				for(int i=0; i<ar.length; i++) {
//					System.out.print(i); //인덱스번호만
					System.out.print(ar[i]+ " ");
					
				}
				
				System.out.println();
		}
		
}
