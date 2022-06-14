package Problem1;

import java.util.Scanner;

import practicc2.if_1;

public class MemberArray {

	public static void main(String[] args) {
		String[] member = new String[] {"ykm", "ykmykm", "Real"};
			Scanner scan = new Scanner(System.in);
		
			
			while(true) {
				String A = scan.next();
				int N=0;
				
				
				for(int i =0; i<member.length; i++) {
					if(member.equals(A)) {
						System.out.println("해당 id는 중복되어 사용불가");
						N++;
					}
					
			}
				if(N==0) {
					System.out.println("아이디가 생성되었습니다");
					break;
				}
			
		
				
			}
		}

	}

