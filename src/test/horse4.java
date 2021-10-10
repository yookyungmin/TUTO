package test;
import java.util.Scanner;

class horse4 {
    public static void main(String[] args) {      
Scanner scanner = new Scanner(System.in);
      
int money = 0; // 현재 가지고 있는 돈

      while(true) {
         System.out.println("경마 게임에 오신 것을 환영합니다.");
         System.out.println("1. 게임 시작");
         System.out.println("2. 잔액 충전");
         System.out.println("3. 잔액 조회");
         System.out.println("4. 종료");
         System.out.println("메뉴를 선택해주세요.");
     
         int num = scanner.nextInt();
         
       
         
         if (num == 2) {   // 잔액 충전
            System.out.println("얼마를 충전하시겠습니까?");
            money += scanner.nextInt();
            
         }
         else if (num ==3) { // 잔액 조회 
            System.out.printf("현재 잔액은 %d원 입니다.%n",money);
         }
         else if (num ==1) { // 게임 시작
            System.out.println("1.우승 경력이 많지만 은퇴를 앞둔 말");
            System.out.println("2.이번달 성적이 제일 좋은 말");
            System.out.println("3.최근 떠오르는 신예인 말");
            System.out.println("배팅 하고 싶은 말을 선택해주세요");
            
            
            int user_holse = scanner.nextInt();   // 내가 선택한 말
            int winner_holse = (int)(Math.random()*3)+1;  // 우승 말
            System.out.println("얼마를 배팅하시겠습니까?");
            int betting = scanner.nextInt();  // 배팅 금액
            
            if (money >=betting) {
               if (user_holse == winner_holse) {
                  money += betting*2;
                  System.out.printf("축하드립니다. 배팅에 성공했습니다.%n");
                  System.out.printf("현재 남은 잔액은 %d원입니다.%n", money );
               } else {
                  money -= betting;
                  System.out.println("배팅에 실패하셨습니다...");
                  System.out.printf("배팅한 금액인 %d원을 모두 잃으셨습니다.%n", betting);
               }
               
               
            } else System.out.println("잔액이 부족합니다.");
         
         }
         else if(num ==4) {  // 게임 종료
            System.out.println("경마 게임을 종료합니다.");
            break;
         }
         
      }
    }
}