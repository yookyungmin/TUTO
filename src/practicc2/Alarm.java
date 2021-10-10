package practicc2;
import java.util.Scanner;
public class Alarm{
	public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);
	
	int H = sc.nextInt(); // 시
	int M= sc.nextInt(); // 분

	if(M<45) {
	H--;
	M = 60-(45-M);

	if(H<0){
	H = 23;
	}
	System.out.println(H+" " + H);
	}
	else{
	System.out.println(H+" "+(M-45));
   }
 }
}