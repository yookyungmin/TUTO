package test;
import java.util.Scanner;
public class horse {

	public static void main(String[] args) {

		System.out.println("경마게임에 오신것을 환영합니다.");
		System.out.println("1.게임 시작");
		System.out.println("2.잔액 충전");
		System.out.println("3.잔액 조회");
		System.out.println("4.종료");
		System.out.println("메뉴를 선택해주세요>>");
		
		int bal = 0; // 계좌 잔액

		
		Scanner sc = new Scanner(System.in);

		while(true) {
			int sel =Integer.parseInt(sc.nextLine());
			if(sel==1) {

				System.out.println("1.우승 경력이 많지만 은퇴를 앞둔말");
				System.out.println("2. 이번달 성적이 제일 좋은말");
				System.out.println("3.최근 떠오르는 신예인 말");
				System.out.println("배팅하고 싶은말을 선택해주세요");
				
				int user_horse = Integer.parseInt(sc.nextLine()); //내가 선택한말
				int winner_horse = (int)(Math.random()*3)+1; // 우승말
				System.out.println("얼마를 배팅하시겠습니까?");
				int betting = Integer.parseInt(sc.nextLine());
				
				if(bal >=betting) {
					if(user_horse==winner_horse) {
						bal+=betting*2;  //  배팅금액의두배를 잔액에 더해줌
						System.out.printf("축하드립니다. 배팅에 성공했습니다.%n");
		                  System.out.printf("현재 남은 잔액은 %d원입니다.%n", bal );
					}
					 else {
		                  bal -= betting; //배팅금액 실패 기존금액에서 -
		                  System.out.println("배팅에 실패하셨습니다...");
		                  System.out.printf("배팅한 금액인 %d원을 모두 잃으셨습니다.%n", betting);
		               }
				}else System.out.println("잔액이 부족합니다");

					

				

				
			} //1번 선택시
			else if(sel==2) {
				System.out.println("얼마를 충전하시겠습니까?");

//				long dep = Integer.parseInt(sc.nextLine());
//				bal+=dep; // 남은 잔액 + 입금잔액
				bal+=Integer.parseInt(sc.nextLine()); // 위에 두줄한줄로 가능
				System.out.println("현재 잔액은"+bal+"원 입니다");
				
			
			} else if(sel==3){
				System.out.println("현재 잔액은"+bal+"원 입니다");
				
			}
			else if(sel==4){
				System.out.println("종료를 선택하셨습니다.");
				break;
			}
			else {
				System.out.println("1~4중에 눌러주세요");
			}
			
		}
		
	}

}
