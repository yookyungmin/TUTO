package Practice;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise5_5 {
// 1~9 사이 중복되지않는 세자리 숫자를 만들어내는 프로그램
	public static void main(String[] args) {
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		
		
		int[] ball3 = new int[3];
		
		//배열 ballArr의 임의의 요소를 골라서 위치를바꾼다
		
			for(int i= 0; i<ballArr.length; i++) {
			 int j=(int)(Math.random()*ballArr.length);
			 int tmp=0;
			
			 
		
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j]	=tmp;

			System.out.println(Arrays.toString(ballArr));
			
		}
	
//		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
//		System.arraycopy(ballArr, 0, ball3, 0, 3);
//		for(int i=0; i<ball3.length; i++) {
//			System.out.println(ball3[i]);
//		}
//		System.out.println();
	}

	/*System.arraycopy(src, srcPos, dest, destPos, length); src - 원본 배열 srcPos - 
	 * 원본 배열의 복사 시작 위치 dest - 복사할 배열 destPost - 복사할 배열의 복사 시작 위치 length - 복사할 요소의 개수
	 */

	
}
