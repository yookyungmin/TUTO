import javax.net.ssl.CertPathTrustManagerParameters;
import javax.swing.plaf.multi.MultiInternalFrameUI;

public class ArraysEx8 {

	public static void main(String[] args) {
		//로또 번호 생성예제, 길이가 45배열 1부터~ 45까지 반복문을 이용하여 배열의 첫번쨰갑과 
		//random()에 의해서 결정된 임의이 위치에 있는값과 자리를바꾸는것을 6번반복
		
		 int[] ball = new int[45];
		 
		 for(int i=0; i<ball.length; i++) 
			 ball[i]=i+1; // ball[0]에 1저장
			 
			 int temp=0; //두값을 바꾸는데 사용할 임시변수
			 int j =0; // 임의의값
			 
			 //배열의 1번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을석느낟.
			 //0번째부터 5번째 요소까지 모두 6개만바꾼다.
			 
			 for(int i=0; i<6; i++) {
				 j=(int)(Math.random()*45); // 0~44범위
				 temp = ball[i];
				 ball[i] = ball[j];
				 ball[j]= temp; //ball[i]와 ball[j] 바꾸기
			 
		 }
			 for(int i=0; i<6; i++)
				 System.out.printf("ball[%d]=%d\n",i, ball[i]);

	}

}
