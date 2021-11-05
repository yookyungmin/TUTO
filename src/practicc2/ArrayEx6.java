package practicc2;

public class ArrayEx6 {

	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
// 배열 생성과 초기화{79,88,91,33,100,55,95};  
		
		int max = score[0]; // 배열의 첫번쨰 값으로 최대값을 초기화한다.
		int min = score[0]; // 배열의 첫번쨰값을 최소값을 초기화한다.
		
		for(int i=1; i<score.length; i++) { // 배열의 두번쨰 요소부터 읽기위해서 변수 i의값을 1로초기화했다 score배열길이만큼
			if(score[i]>max) {//  max값보다 크면 최대값
				max=score[i];
			}else if(score[i]<min) { // min 값보다 작으면 min 값
				min=score[i];
								
			}
		}// end of for
			System.out.println("최솟갑"+min);
			System.out.println("최댓갑"+max);

	} //main 끝

}//class 끝
