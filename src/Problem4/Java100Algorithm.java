package Problem4;
//정수로 이루어진 배열에서 가장큰값을 구하는 최댓값알고리즘을 구현

// [4, 13, 150, 17, -2]
public class Java100Algorithm {

	public static void main(String[] args) {
		//[1]배열 선언
		
		int[] ar = {4,13,150,17, -2};
		
		//[2] max, min 함수
		System.out.println(Math.max(10, 4));
		System.out.println(Math.min(10, 4));
		
		//[3] 일단 배열내 첫번쨰 원소의 값이 제일 크다고 가정하고 초기화

//		int max = Integer.MIN_VALUE; //가장작은값을 셋팅해야 하나씩비교해야하기떄문
		
		int max = ar[0]; // 0번째를 맥스값으로 지정ㅋ
		
		//[4] : 반복문을 돌면서 비교하여 출력 이때, 비교는 2번쨰 부터 비교하면 되니까 int i = 1로 시작
		System.out.println("현재배열내 가장 큰값은 "+max);

		for(int i = 1; i<ar.length; i++) { //max값이 ar[0] 이기때문에 ar[1] 부터 시작해서비교
			if(max <ar[i]) {
				max = ar[i]; //현재의 배열 i번째값
//			System.out.println(ar[i]+" "); //13, 15, 17, 2
//			
		}
		}
	
		System.out.println("현재배열내 가장 큰값은 "+max);

	}

}
