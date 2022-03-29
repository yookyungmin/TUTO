package Poly;

import java.util.Scanner;

import practicc2.if_1;

class Product {
	// 제품의 가격
	int price;
	// 제품 구매시 제공하는 보너스 점스
	int bonusPoint;
	
	
	// 생성자
	public Product(int price) {
		this.price = price;
		// 보너스 점수는 제품가격의 10%
		bonusPoint = (int) (price/10.0);
	}
	public Product() {	}
}

 class Tv extends Product{
	 Tv() {
		// 부모 생성자 호출해서 100 으로 가격을 던진다
		super(100);
	}
	
	// (기본적으로 들어있는 최상위 클래스인)
	// 오브젝트 클래스의 것을 가져와 오버라이딩
	@Override
	public String toString() {
		return "TV";
	}
}
 
 class Pc extends Product {	
		// 기본 생성자를 만들고
		 Pc() {
			// 상위 클래스에 200 값 넘겨주기
			super(200);
		}
		
		// 오브젝트 클래스에서 가져와
		// 오버라이딩 해준 것
		@Override
		public String toString() {
			return "Pc";
		}
	
	}
 
 
 class Refrigerator extends Product {
		Refrigerator() {
			super(300);
		}
		
		@Override
		public String toString() {
			return "냉장고";
		}
	}


	// 핸드폰
	 class Phone extends Product {
		 Phone() {
			super(120);
		}
		
		@Override
		public String toString() {
			return "핸드폰";
		}
	}



	// 에어컨
	 class AirConditioner extends Product {
		public AirConditioner() {
			super(500);
		}
		
		@Override
		public String toString() {
			return "에어컨";
		}
	}
	 class Buyer {

			int money = 1000;
			int bonusPoint = 0;
			int sum=0;
			
			// 객체를 배열로 담아주기 위함
			// 구입한 제품을 저장하기 위한 배열
			Product[] item = new Product[10];
			// Product 배열에 사용할 카운터
			int i = 0;
			
			
			void buy(Product p) {
				if (money < p.price) {
					System.out.println("잔액이 부족합니다 물건을 살 수 없습니다");

					return;
				}

				money -= p.price;
				bonusPoint += p.bonusPoint;
				
				// p에 담기는 것은 주소
				// 인덱스가 하나씩 늘어나며 주소가 담긴다
				// PolyArgument 에서 들어온 buyer.buy(값);
				// 저 값을 item 배열에 저장하는 것
				item[i++] = p;

				System.out.println(p.toString() + "을/를 구매하셨습니다");
			}
			
			void refund(Product p) {
				for (int i = 0; i < item.length; i++) {
					if (item[i] == null) {
						break;
					}
					sum += item[i].price;
				}
				// 환불 요구한 제품의 인덱스 찾가
				for (i = 0; i < item.length; i++) {
					if (p == item[i]) {
						// 저장되어 내려온 item[i] 칸에서
						// 저장된 요소들을 꺼내 계산한다
						sum -= item[i].price;
						bonusPoint -= item[i].bonusPoint;

						System.out.println("\n*********************************");
						System.out.println("환금 제품 : " + item[i].toString());
						System.out.println("환불 가격 : " + item[i].price);
						System.out.println("삭제된 포인트 : " + item[i].bonusPoint);
						System.out.println("구매내역");
						break;
					} else {
						System.out.println();
						System.out.println("환불 내역을 찾는 중입니다..");
					}
				}
			}
			
			// 구매한 제품의 정보를 요약하는 메소드
			void summary() {
				// 물품의 총 구매 가격
				int sum= 0;
				// 구입한 물품 리스트
				String itemList = " ";
				// 보너스 포인트
				int bonusPoint = 0;
				
				//반복문을 사용하여 물풍의 가격 합과 리스트 출력
				for (int i=0; i<item.length; i++) {
					if(item[i] == null) {
						break;
					}
					// item 에 저장되어있는 가격과 물품 내역을
					// 변수에 누적
					sum += item[i].price;
					itemList += item[i].toString() + " ";
					bonusPoint += item[i].bonusPoint;
				}
				System.out.println("총 구매 금액 : " + sum);
				System.out.println("쌓인 포인트 내역 : " + bonusPoint);
				System.out.println("구입하신 물품 내역 :"+ itemList);
				System.out.println("좋은 하루 보내세요");
			}
		}
	 
	 public class Polyargu {
			public static void main(String[] args) {

				// 객체 생성
				Scanner sc = new Scanner(System.in);
				Buyer buyer = new Buyer();
				
				

				// 제품 클래스 객체 생성
				Tv tv = new Tv();
				Pc pc = new Pc();
				Refrigerator re = new Refrigerator();
				AirConditioner air = new AirConditioner();
				Phone ph = new Phone();

				boolean a = true;
				while (a) {
					// 매개 변수 값으로 제품 객체 집어넣기
					System.out.println("제품을 입력해주세요");
					System.out.print(">>");
					String input = sc.next();

					if (input.equals("에어컨")) {
						buyer.buy(air);
						System.out.println("현재 잔금 : " + buyer.money);
						System.out.println("현재 보너스포인트 : " + buyer.bonusPoint);
						System.out.println("-----------------------------");

					} else if (input.equals("냉장고")) {
						buyer.buy(re);
						System.out.println("현재 잔금 : " + buyer.money);
						System.out.println("현재 보너스포인트 : " + buyer.bonusPoint);
						System.out.println("-----------------------------");
					} else if (input.equals("핸드폰")) {
						buyer.buy(ph);
						System.out.println("현재 잔금 : " + buyer.money);
						System.out.println("현재 보너스포인트 : " + buyer.bonusPoint);
						System.out.println("-----------------------------");
					}else if(input.equals("Tv")) {
						buyer.buy(tv);
						System.out.println("현재 잔금 : " + buyer.money);
						System.out.println("현재 보너스포인트 : " + buyer.bonusPoint);
						System.out.println("-----------------------------");
					}else if(input.equals("컴퓨터")){
						buyer.buy(pc);
						System.out.println("현재 잔금:"+buyer.money);
						System.out.println("현재 보너스포인트 : " + buyer.bonusPoint);
						System.out.println("-----------------------------");
					}
					
					else {
						a = false;
					}
				}
				buyer.refund(tv);
				buyer.refund(pc);
				
				System.out.println("-----------------------------");
				System.out.println("총 구매 금액 : " + buyer.sum);
				System.out.println("쌓인 포인트 내역 : " + buyer.bonusPoint);
				System.out.println("좋은 하루 보내세요");
				buyer.summary();
			}
	 }