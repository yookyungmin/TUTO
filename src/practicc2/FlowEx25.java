package practicc2;

import java.util.Scanner;
//숫자를 입력 받고 이숫자으 ㅣ각자리의합을 구하는 예제
public class FlowEx25 {

	public static void main(String[] args) {
		int num =0, sum= 0;
		System.out.print("숫자를 입력하세요. (예.12345)>");
		Scanner scanner = new Scanner(System.in);
		
//		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에저장
//		num = Integer.parseInt(tmp); //입력받은 tmp문자열을 를 숫자로 변환
		// nextint쓰고 nextline쓰면 버퍼생김
		num = scanner.nextInt();
		
		while(num!=0) {
			//num을 10으로 나눈 나머지를 sum에더함
		sum+= num%10; // sum = sum+ num%10;
		System.out.printf("sum=%3d num=%d\n",sum,num);
		
		num /=10; // num=num /10; num을 10으로 나눈값을 num에저장
		}
			System.out.println("각 자리수의 합:"+sum);
		

	}

}
