import java.util.Scanner;

public class swac {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//			int T;
//			T=sc.nextInt();
//	
//			
//			for(int test_case=1; test_case<=T; test_case++) {
//			int[] arr = new int[10];
//			double sum=0;
//			double avg = 0;
//			
//			for(int i=0; i<10; i++) {
//				arr[i] = sc.nextInt(); //10개의 수를 입력받는다.
//			}
//			for(int i=0; i<10; i++) {
//				sum+= arr[i]; // 총합
//				avg = sum/(double)10; // 평균
//				double result = (double)Math.round(avg*10)/10;
//			}
//				System.out.printf("#%d %f%n",test_case, result);
//			
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        int [] sum = new int[n];
        while(num < n) {
            for (int i = 0; i < 10; i++)
                sum[num] += scanner.nextInt();
            num++;
        }
        for(int i = 0; i < sum.length; i++)
            System.out.printf("#%d %d\n",i+1,Math.round(sum[i]/10f));
		}

	}


