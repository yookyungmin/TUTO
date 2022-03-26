import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import practicc2.if_1;

public class ladder {
		public static void main(String[] args) throws IOException { // 입출력 예외 발생하면 클래스를 벗어난다
			System.out.println("사다리 타기를 시작합니다");
			System.out.println();
			
			int flag = 0;
			ladder exe = new ladder();
			exe.LineSelect();
			BufferedReader tt = new BufferedReader(new InputStreamReader(System.in));
			
			while(flag==0)
			{
				System.out.print("다시 시작: '1' 종료 : '2'");
				String con = tt.readLine();
				int num1= Integer.parseInt(con);
				
				if(num1 ==1) {
					exe.LineSelect();
				}
				else if(num1==2) {
					System.out.println("사다리타기를 종료");
					flag = 1;
					
				}
				else if(num1 != 1&& num1 !=2 ) //둘다아니면
				{
						System.out.println("다시입력해주세요");
				}
			
			
		}
}

public void LineSelect() throws IOException{
	
	int num; //사다리 인원수
	int comNum;
	String[] arr1;  //
	int[] arr2;
	
	System.out.println("사다리 제목을 입력");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str = br.readLine(); //String으로 리턴값 고정, 다른타입으로 할시형변환필수 예외처리 필수, 보통throws IOEXception을 통하여 작업
	String title= str; //title =사다리제목
	
	System.out.println("참가자 인원 수 :");
	str = br.readLine();  //String 고정이라서
	num= Integer.parseInt(str); //int로형변환 //참가자 인원수
	
	arr1 = new String[num]; //arr1 //참가자 인원수
	for(int i =1; i<=num; i++) {
		System.out.println(i+"번째 참가자 이름 입력");
		str = br.readLine();
		arr1[i-1] = str;
	}
	System.out.println();
	arr2= new int[num]; //arr2'
	
	for(int i=0; i<num; i++) { //i가 0부터 1씩 증가 num미만까지
		int com=(int)(Math.random()*num+1);
		arr2[i] = com;
		for(int j=0; j<i; j++) {
			if(arr2[i]==arr2[j]) {
				i--;
			}
		}
	}
	
	System.out.println("번호를 배정하려면 엔터 입력");
	str = br.readLine();
	
	for(int i=0; i<num; i++) {
		System.out.println(arr1[i]+"\t");
	}
	System.out.println();
	for(int i=0; i<num; i++) {
		System.out.println(arr2[i]+"\t");
	}
	System.out.println();
	System.out.println();
	System.err.println("사다리 타기를 시작하려면 엔터 입력");
	str=br.readLine();
	
	comNum =(int)(Math.random()*num+1);
	
	for(int i=0; i<num; i++) {
		if(comNum==arr2[i])
		{
			System.out.println(title+"추첨결과");
			System.out.println("당첨번호 : "+comNum+"\t 당첨자: "+arr1[i]);
		}
	}
}
}
