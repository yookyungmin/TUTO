package practicc2;

public class ArrayEx5 {

	public static void main(String[] args) {
		int sum =0;//총점을 저장하기 위한 변수
		float average = 0f;//평균을 저장하기위한변수
		
		int[] score = {100, 88, 100, 100,90};

		for(int i = 0; i<score.length; i++){
			sum+=score[i]; // 반복문을 이용해서 배열에 저장되어있는 값들으 모두 더한다.
		}
		average = sum/(float)score.length; // 계산결과를 float로 얻기위해서 형변환
		
		System.out.println("총점을 입력하세요"+sum);
		System.out.println("평균을 입력하세요"+average);
		

	}

}
