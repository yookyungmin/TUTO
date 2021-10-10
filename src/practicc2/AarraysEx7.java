package practicc2;

public class AarraysEx7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i; //배열을 0~9숫자로초기화한다.
			System.out.println(numArr);
			
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n =(int)(Math.random()*10);// 0~9중 한값을 임의로 덛는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n]; 
			numArr[n]=tmp;    
			//numArr[0] 과 numArr[n]의 값을 서로 바꾼다.
			
		}
			for(int i=0; i<numArr.length; i++) 
			{
					System.out.println(numArr[i]);
			}

	}

}
