package practicc2;
import java.util.*;
class FlowEx4{
	public static void main(String[] args){

	int score = 0; // 점수 저장
	char grade = 0; //함수저장
	System.out.println("점수를입력하세요>");

	//입력값
	Scanner sc = new Scanner(System.in);
	
	score = sc.nextInt(); // 화면에 입력
	if(score >=90){	
		grade = 'A';
		}
	else if (score>=80){
		grade = 'B';
	}
	else if(score >=70){
		grade = 'C';
	}
	else {
	grade = 'D';
}

	System.out.println("당신의 학점은 "+grade+"입니다.");
}



}