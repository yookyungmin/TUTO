package Numberprint;

import java.util.InputMismatchException;
import java.util.Scanner;

import practicc2.if_1;

//기능 : 이름과 번호를 입력받아 저장한뒤 이름을 집어 넣으면 해당 이름에 맞는ㅂ너호 출력
class People{
	
	String name;
	int phoneNum;
	

	public People(String name, int phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	public void ShowPhoneNum() {
		System.out.println(name+"의 번호는"+phoneNum+"입니다");
	}
}

public class NameNumber {
			public static void main(String[] args) {
				
				boolean exit= false; //"그만"을 입력 했을때 dowhile문을 빠져나오기 위한 boolean 변수
				
				/*catch 문을 통해 오류가 검출되면 프로그램이 끝나느 것을 막고 다시 입력하게 하기 위해 dowhile문 안에 넣음*/
				do {
					
					try {
						Scanner sc =new Scanner(System.in);
						System.out.println("인원수 입력");
						int personNum= sc.nextInt();
						People[] p = new People[personNum]; // 인원수 입력 그대로 객체배열 생성
						
						/*이름과 전화번호 입력받기*/
						for(int i =0; i<p.length; i++) {
							System.out.println("이름과 전화번호(이름과 번호는 빈칸없이 입력="); //반복문을 통해 이름과 번호를 입력한 인원수 만큼 입력받음
							String pName = sc.next();
							int pPhoneNum =sc.nextInt();
							p[i] = new People(pName, pPhoneNum);
						}
						System.out.println("저장되었습니다");
						//입력받은 이름과 전화 번호 출력하기
						for(int j=0; j<Integer.MAX_VALUE; j++ ) {//번호를찾기 위해 입력해야할 이름을 받는스캐너 클래스 무한반복 //Integer.MAX_VALUE 정수 최대값
							System.out.println("검색할 이름>>");	
							System.out.println("전체 명단 공개 = 2번");
							String serchName = sc.next(); //검색한이름
							boolean test =true; //입력값에 따라 다르게 출력하기 위해만든 boolean 변수
							
						
						for(int i =0; i<p.length; i++) { //위에 생성한 객체배열 p의 길이만큼 반복
							
						if(serchName.equals(p[i].name)) {
								p[i].ShowPhoneNum();
								test = true;
								break;
							}
								
							else {
								test=false; //이름이 없는 경우 이름이 없다는것을 알린다.
							}
						}
//						System.out.println("전체 명단 출력은= 2");
//						int serchNum = sc.nextInt();
//						test = true;
//						for(int i=0; i<p.length; i++) {
//							if(serchNum==2) {
//								p[i].ShowPhoneNum();
//								test = true;
//							}
//						}
					
						if(serchName.equals("2")) {
							for(int i =0; i<p.length; i++) {
								p[i].ShowPhoneNum();
							}
						}else if(serchName.equals("그만")) { //그만 입력하면 프로그램 종료, 다를경우 존재하지 않습니다 출력
							System.out.println("프로그램을 종료합니다");
							exit = true; // dowhile 반복문안에 있기 댸문에 true로 바꿔주지 않으면 무한루프에빠짐
							break; //프로그램 종료
						}else if(!test) {
							System.out.println(serchName+"는 존재하지 않습니다"); //입력받은 문자열이 배열에 없을경우 출력
						}
						}
						sc.close();
					}catch(InputMismatchException e) {
						System.out.println("값을 제대로 입력해주세요"); //인원수입력칸에 다른 타입을 넣을경우출력
					}
					
				}
				while(!exit); //그만 입력될 경우탈출

	}
}
