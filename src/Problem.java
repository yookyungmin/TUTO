import java.util.Scanner;

import javax.print.attribute.standard.JobName;
/*
 * // 문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//      생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//      입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
 */
class Book{
	private String bname;
	private String bwriter;
	private String publisher;
	private int price;
	
	Book(String bname, String bwriter, String publisher, int price){
		this.bname = bname;
		this.bwriter = bwriter;
		this.publisher = publisher;
		this.price = price;
	}
	Book(){
		this("홍길동", "허균", "조선", 20000);  //기본값
	}
	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void bookinfo() {
			System.out.println("책의 이름은="+bname
							+"\n책의 저자는 ="+bwriter
							+"\n책의 출판사는 ="+publisher
							+"\n책의 가격은="+price +"원");
	}
	
	public String toString() {
		return "책의 이름은=" +bname
				+"\n 책의 저자는="+bwriter
				+"\n 책의 출판사는="+publisher
				+"\n 책의 가격은=" +price +"원";
	}
	
	
}

public class Problem{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("책의 이름, 저자, 출판사, 가격을 입력하세요");
//		Book b = new Book(sc.next(), sc.next(), sc.next(), sc.nextInt());
		
		Book b2 = new Book();
		b2.bookinfo();
//		System.out.println(b2.toString());
		  String inName, inWriter, inPub;
	   
	      while(true) {
	    	  
	      
	      System.out.print("책 제목을 입력 > ");
	      inName = sc.next();
	      System.out.print("저자를 입력 > ");
	      inWriter = sc.next();
	      System.out.print("출판사를 입력 > ");
	      inPub = sc.next();
	      System.out.print("금액을 입력 > ");
	      int inPrice = Integer.parseInt(sc.next());
	      System.out.println("입력이 완료 되었습니다");
		Book b = new Book(inName, inWriter, inPub, inPrice);
		
		b.bookinfo();
		System.out.println(b.toString());
		
	      }
	     
}
	
}