package test;
import java.util.Scanner;

class horse3 {
    public static void main(String[] args) {
        System.out.println("경마게임에 오신 것을 환영합니다.");
        int balance = 0;
        int choice =0;
        int bet=0;
        while (true){
         
            System.out.println("1: 게임 시작");
            System.out.println("2: 잔액 충전");
            System.out.println("3: 잔액 조회");
            System.out.println("4: 종료");

            Scanner sc = new Scanner(System.in);
            int input = Integer.parseInt(sc.nextLine());

            if (input==1){
            	   int winner=(int)(Math.random()*3)+1;
                   System.out.println("winner:"+winner);
                System.out.println("1. 우승 경력이 많지만 은퇴를 앞둔 말");
                System.out.println("2. 이번달 성적이 제일 좋은 말");
                System.out.println("3. 최근에 떠오르는 신예인 말");
                System.out.println("배팅하고 싶은 말을 선택해주세요.");

                choice = Integer.parseInt(sc.nextLine());
                System.out.println("얼마에 배팅하시겠습니까?");

                bet=Integer.parseInt(sc.nextLine());
                balance-=bet;

                if(choice==winner){
                    System.out.println("배팅에 성공하셨습니다. 포상금 2배를 지급합니다.");
                    balance+=bet*2;
                } else {
                    System.out.println("배팅에 실패하셨습니다. 돈을 잃으셨습니다.");
                }
            }

            if (input==2){
                System.out.println("얼마를 충전하시겠습니까?");
                balance+= Integer.parseInt(sc.nextLine());
            }

            if (input==3){
                System.out.println("현재 잔액은" + balance +"원 입니다.");
            }

            if (input==4){
                System.out.println("게임을 종료합니다.");
                System.exit(0);
            }
        }
    }

}