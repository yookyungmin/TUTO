package practicc2;

//import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
//2차원 배열은 2중for문써야댐 
public class ArraysEx18 {

	public static void main(String[] args) {
		int[][] score = {  {100,100,100}
						,  {20,20,20}
						,  {30,30,30}
						,  {40,40,40}};  // 4행(row) 3열(column)
		
		int sum=0; 
		for(int i=0; i<score.length; i++) { //score.length(몇행)  = 4 , 0~3
			for(int j=0; j<score[i].length; j++) { // 3열
				
				// score[0], score[1], score[2],score[3].length , 들이 참조하는 배열의 길이
				System.out.printf("score[%d][%d] = %d\n", i, j,score[i][j]);
			}
			
		}
		
		for(int[] tmp:score) { //향상된 for문 
			for(int i :tmp) {
				sum +=i;
			}
		}
		System.out.println("sum="+sum);

	}

}
