package test;
import java.util.Scanner;

public class horse2 {
    private static final int DEFAULT_MONEY = 1000;

    private final Scanner sc = new Scanner(System.in);
    private int money = DEFAULT_MONEY;

    private void showMainMenu() {
        while (true){
            System.out.println("경마겜에 오신걸"+ " 환영합니다");
            System.out.println("1. 시작하기");
            System.out.println("2. 잔액확인");
            System.out.println("3. 종료");

            int select = this.inputInt();
            if (select == 1) {
                System.out.println("뭔가 겜하기");
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
            String input = sc.next();
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