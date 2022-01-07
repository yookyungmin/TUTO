package test;

import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LottoBubble {

	public static void main(String[] args) {
	//int n[0], n[1], n[2], n[4] , n[5];
		
		int[] n = new int[6]; // 0~5		
		
		//게임수랑 돈입력
		int money = 0, game=0;
		
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.print("금액 입력>>");
				money=sc.nextInt();
				System.out.print("게임수입력>>");
//				game= Integer.parseInt(sc.nextLine()); NumberFormatException 발생 catch문 처리해야됨
				game = sc.nextInt();
				} catch(InputMismatchException e) {//스캐너가 정수로 받는데 문자로 입력하면 오류
					System.out.println("문자 입력 오류");
					sc.nextLine();//입력 버퍼에 있는 문자열을 읽어서비운다
					continue; // 조건식으로
				}
			if(game<1 || money>game*1000) { //게임입력값이1 보다작거나 money가 게임*1000값보다 클떄
				System.out.println("입력 오류!! 게임수나 금액에 오류가 있씁니다");
				continue;
			}
			break; // 금액과 게임수가 정상이면 반복문 탈출
		}while(true);
		sc.close();
		//게임수가 결정이 되면
		for (int i=1; i<game; i++) {
			n[0] =(int)(Math.random()*45)+1; //45값까지 랜덤
				do {
					n[1]=(int)(Math.random()*45)+1;
				}while(n[1]==n[0]); //참일동안 반복, 거짓탈출 //n[1]==n[0] 같을동안반복
				
				do {
					n[2]=(int)(Math.random()*45)+1;
				}while(n[2]==n[0]||n[2]==n[1]); //n[2] ==n[0] 같거나 n[1] 같을동안반복
				do {
					n[3]=(int)(Math.random()*45)+1;
				}while(n[3]==n[0]||n[3]==n[1]||n[3]==n[2]); //인덱스 3 ==0, 1, 2 일대 반복
				do {
					n[4]=(int)(Math.random()*45)+1;
				}while(n[4]==n[0]||n[4]==n[1]||n[4]==n[2]||n[4]==n[3]);      
				do {
					n[5]=(int)(Math.random()*45)+1;
				}while(n[5]==n[0]||n[5]==n[1]||n[5]==n[2]||n[5]==n[3]||n[5]==n[4]);            
					
				//System.out.println("로또번호"+i+" : "+n[0]+","+n[1]+","+n[2]+","+
				//      n[3]+","+n[4]+","+n[5]);  //로또번호 1
					//aryprint("로또 번호"+i+":",bubbleSort(n));
					Arrays.sort(n); //오름차순 정렬
					aryPrint("로또 번호"+i+":",n);
				
	}
				System.out.println("잔액:"+(money-game*1000)+"원");
}	//main
	public static int[] bubbleSort(int[] ary) {
		int temp;
		boolean sw;
		for(int k= 1; k<ary.length; k++) {
			sw=true; //반복문 전 초기화 부여
			for(int i=0; i<ary.length-k;i++) {
				if(ary[i]>ary[i+1]) {//교환
					temp = ary[i]; ary[i]=ary[i+1]; ary[i+1]=temp;
					sw=false;//바뀜 발생
					
				}
			}//end for i
				if(sw)break;
		} //end for k
			return ary;
	}//bubbleSort 버블정렬 //두수 비교해서 작은수가 왼쪽으로
	public static void aryPrint(String title, int[] ary) {
		System.out.print(title);
		for(int i=0; i<ary.length;i++) {
			System.out.print(ary[i]);
			if(i<ary.length-1)
				System.out.println(",");
		}
		System.out.println();//줄바꿈
	}//aryPrint메서드
}//class
	

