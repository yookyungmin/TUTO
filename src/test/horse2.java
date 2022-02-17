package test;
import java.util.Scanner;

import javax.security.auth.callback.ChoiceCallback;

public class horse2 {
    private static final int DEFAULT_MONEY = 1000;

//    private final Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    private int money = DEFAULT_MONEY;
    int bet =0;

    private void showMainMenu() {
        while (true){
            System.out.println("경마겜에 오신걸"+ " 환영합니다");
            System.out.println("1. 시작하기");
            System.out.println("2. 잔액확인");
            System.out.println("3. 종료");

            int select = this.inputInt();
            if (select == 1) {
            	   int winner=(int)(Math.random()*3)+1;
                   System.out.println("winner:"+winner); //우승말
            	System.out.println("1우승 경력이 많지만 은퇴를 앞둔말");
				System.out.println("2 이번달 성적이 제일 좋은말");
				System.out.println("3 최근 떠오르는 신예인 말");
				System.out.println("배팅하고 싶은 말을 선택해주세요");
				int choice = Integer.parseInt(sc.nextLine()); //초이스말
		         System.out.println("얼마에 배팅하시겠습니까?");
		         bet=Integer.parseInt(sc.nextLine()); 
	             money-=bet;
	             if(choice==winner){
	                    System.out.println("배팅에 성공하셨습니다. 포상금 2배를 지급합니다.");
	                   money+=bet*2;
	                } else {
	                    System.out.println("배팅에 실패하셨습니다. 돈을 잃으셨습니다.");
	                }
		         
            } else if (select == 2) {
                this.showMoneyMenu();
            } else if (select == 3) {
                System.out.println("바이바이");
                break;
            } else {
                System.out.println("1-3 중에 입력하세요");
            }
        }
    }

    private void showMoneyMenu() {
        while (true) {
            System.out.println("잔액확인합니다");
            System.out.println("잔액은 " + this.money + "원 입니다");
            System.out.println("1. 잔액충전");
            System.out.println("2. 나가기");

            int select = this.inputInt();
            if (select == 1) {
                this.showChargeMoneyMenu();
            } else if (select == 2) {
            	
                System.out.println("메인으로");
                break;
            } else {
                System.out.println("1-2 중에 입력하세요");
            }
        }
    }

    private void showChargeMoneyMenu() {
        System.out.println("잔액충전입니다");
        while (true) {
            System.out.println("충전할 금액을 입력하세요");
            int money = this.inputInt();
            if (money < 0) {
                System.out.println("음수는 안되요");
            } else {
                this.money += money;
                break;
            }
        }
    }

    public int inputInt() {
        while (true) {
            System.out.print("> ");
            String input = sc.nextLine();
            int number = 0;
            try {
                number = Integer.parseInt(input);
                return number;
            } catch(Exception e) {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public static void main(String[] args) {
        horse2 healingGame = new horse2();
        healingGame.showMainMenu();
    }
}