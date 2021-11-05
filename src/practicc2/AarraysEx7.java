package practicc2;

public class AarraysEx7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];// numArr 배열 길이 10 생성
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		//0부터 numArr길이만큼1씩증가 , 배열 0~9숫자초기화 numArr 출력
		//배열을 0~9숫자로초기화한다.
		// numArr 출력
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n= (int)(Math.random()*10);// 0~9중 한값을 임의로 덛는다.
			
			int tmp = numArr[0];
			numArr[0]= numArr[n];
			numArr[n]= tmp;//numArr[0] 과 numArr[n]의 값을 서로 바꾼다.
			
		}
			for(int i=0; i<numArr.length; i++) 
			{
					System.out.print(numArr[i]);
			}

	}

}
