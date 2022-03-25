package practicc2;
import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
class ATM {
	public static void main(String[] args) {
	
	System.out.println("****ATM SIMULATOR*****");
	System.out.println("***************************");
	System.out.println("1.Balance inquiry"); //계좌 조회
	System.out.println("2.Depoit"); // 입금
	System.out.println("3.witdrwal");// 출금
	System.out.println("4.Exit");//종료
	System.out.println(">>");

	int bal = 0; //계좌잔액

	Scanner sc = new Scanner(System.in);
	//nextInt는 엔터키를 쳤을대 입력 두개가 더 들어가서 nextLine이랑 혼합해서 쓸때는 형변환해서 하는게 버퍼문제가 안생김
	while(true){
	
		int sel =Integer.parseInt(sc.nextLine()); // 문자열로 받아서 숫자로 변환
		if(sel==1) {
			System.out.println("남은 계좌 잔액은\"+bal+\"입니다");
		}
		else if(sel==2){
		System.out.println("입금하실 금액을 입력해주세요");
	
		long dep = Integer.parseInt(sc.nextLine());
		bal+=dep;
		System.out.println("남은 계좌 잔액은"+bal+"입니다.");
		
	}else if(sel==3){
		if(bal==0) {//중첩 if문 3번을 누르면서 잔액이 0이면
			System.out.println("잔액이0원이므로 출력할 수 없습니다.");
			continue;
		}
		else if(bal>=0) {
			System.out.println("남은잔액은"+bal+"입니다.");
		}
		System.out.println("출금하실 금액을 입력해주세요");
	
		int witd = Integer.parseInt(sc.nextLine());
		if(bal>=witd){ //계좌 잔액과 출금금액이 같거나 많으면
			bal-=witd; // 출금
			System.out.println("남은 계좌 잔액은"+bal+"입니다.");
			System.out.println("다른 메뉴를 선택하시겠습니까?");
		}else{
			System.out.println("계좌 잔액이 부족합니다 다시입력해주세요");
			
			}
	}else if(sel==4){
			System.out.println("이용해주셔서 감사합니다");
			continue; // 다음문장을 수행하지 않고 다시 제어문의 처음으로 돌아간다.
							}
	}
	//break는 해당 if문만 종료시키지만, return은 해당 메소드가 호출된 곳까지 종료시킨다. 즉, 
	//if문을 포함한 메소드 자체를 종료시킨다 

		}

		
	}
