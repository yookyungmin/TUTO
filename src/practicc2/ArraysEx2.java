package practicc2;

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100, 95,80, 70,60};
		int[] iArr3 = {100, 95, 80, 70,60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i]=i+1; // 1~10 숫자를 순서대로 배열에 넣는다.
//			System.out.print(iArr1[i]+",");
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] =(int)(Math.random()*10)+1; // 1 ~ 11 값을 배열에 저장
		}
//		//배열에 저장된 값을 출력한다.
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+","); // 각 요소 구간에 구별을 위해 쉼표를 넣는다.
		}
		System.out.println(Arrays.toString(iArr2)); // 1~11 값 배열출력
		System.out.println(Arrays.toString(iArr3)); // 바로출력
		System.out.println(Arrays.toString(chArr)); //[a, b, c, d]
		System.out.println(iArr2);  //[I@15db9742 이런식
		System.out.println(chArr); // abcd 그대로
		
		
		
	}

}
