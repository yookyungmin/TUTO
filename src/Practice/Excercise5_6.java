package Practice;
import java.util.Scanner;
class Excercise5_6{

// 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제
	public static void  main(String args[]) {

		//스트링 변수이름 words 생성
	String[] words = { "television", "computer", "mouse", "phone"};
	//스캐너문
	Scanner scanner = new Scanner(System.in);
	//0부터~ words.length. 길이만큼 증가 
	for(int i = 0; i<words.length; i++){

	char[] question = words[i].toCharArray();//words/ string베ㅇ열,ㄹ 을 char[] 로변환
//한글한글자 위치바꿔주기위해 char배열로 변경
	for(int j = 0; j<question.length; j++){
	int idx = (int)(Math.random()*question.length);
	
	char tmp = question[i];//char tmp에 question[i] 담기
	question[i]=question[idx];// question[i]에 question[idx]담기
	question[idx] = tmp;// idx 배열에 tmp 담기
}
	System.out.printf("Q%d. %s의 정답을 입력하세요 >", i+1, new String (question));
	//new String 안붙이면 [I@4545같은 형식으로 나옴

	String answer = scanner.nextLine(); // 사용자가 입력 하는 정답

	//trim()으로 answer의 좌우 공백을 제거한 후, equals 로 word[i]와 비교 	
	if(words[i].equals(answer.trim()))
	System.out.printf("맞았습니다.\n\n");
	else
	System.out.printf("틀렸습니다.\n\n");
}
}//main의끝
}