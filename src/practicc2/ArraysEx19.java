package practicc2;

import javax.swing.plaf.synth.SynthScrollPaneUI;

/*
new int[5][3]; // 5행 3열
[5] == score.length
[3]== score[i].length
*/

public class ArraysEx19 {

	public static void main(String[] args) {
		int[][] score = {
						{100, 100, 100},
						{20,20,20},
						{30,30,30},
						{40,40,40},
						{50,50,50} 
						};  // {국어 영어 수학} // 4행 3열
		//과목별 총점
		int korTotal =0, EngTotal=0, MathTotal=0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("=====================");
		
		for(int i=0; i<score.length; i++) { // 5행
			int sum =0; // 개인 별 총점
			float avg =0.0f; // 개인별 평균
			
			korTotal += score[i][0];
			EngTotal += score[i][1];
			MathTotal += score[i][2];
		
			System.out.printf("%3d",i+1); //5행 번호출력
			
			
			for(int j=0; j<score[i].length;j++) { //3열
				sum+=score[i][j]; //
				System.out.printf("%5d",score[i][j]); //점수만 출력			
				

			}
			avg = sum/(float)score[i].length; //배열의 길이,3/ 3.0으로 나누기 위해 float형변환

			System.out.printf("%5d %5.1f\n",sum, avg); //총합, 평균출력
		
		}
		 
		System.out.println("=====================");
		System.out.printf("총점: %3d %4d %5d",korTotal,EngTotal,MathTotal);
		
		
	}

}
