package practicc2;

import java.io.InterruptedIOException;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Hello {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// 1.배열을 1부터~5로 초기화한다.
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		//2.배열을 출력한다.
			System.out.println("[변경전]");
			System.out.println("arr.length"+arr.length);
			for(int i=0; i<arr.length; i++) {
				System.out.println("arr["+i+"]="+arr[i]);
			}

			
			//3.기존 배열을 2배크기의 배열 tmp를 배열을 새로만든다.
			int[] tmp = new int[arr.length*2];
			for(int  i=0; i<arr.length; i++) {
				tmp[i]=arr[i];
				
			}
			
			//4. 참조변수 tmp의 값을 참조변수 arr 에 저장
			arr=tmp;
			
			
			
			//5.arr 배열을 출력한다.
			System.out.println("[변경후]");
			System.out.println("arr.length:"+arr.length); //배열의 길이
			for(int i=0; i<arr.length; i++) {
				System.out.println("arr["+i+"]="+arr[i]);
			}
			
		
		

		}

}