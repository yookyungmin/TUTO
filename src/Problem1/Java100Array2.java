package Problem1;

public class Java100Array2 {
		public static void main(String[] args) {
			
			//[1]배열 선언
			int[] sales_table = {33, 46, 21, 87, 68};
			
		//[2] 반복문을 사용하여 모든값출력
			
			for(int i=0; i<sales_table.length; i++) {
				System.out.println(i);  //배열의 인덱스길이만큼 출력
			}
			
			for(int i = 0; i<sales_table.length; i++) {
//				System.out.print(i+ " "); //인덱스 값 01234
				System.out.print(sales_table[i]+" "); 
				
			}
			System.out.println();		
		}

}
