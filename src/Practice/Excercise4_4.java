package Practice;

public class Excercise4_4 {
/*[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
  몇까지 더해야 총합이100이상이 되는지 구하시오.*/
	
	public static void main(String[] args) {
		int sum = 0; //총합을 저장할 변수
		int s=1; //값의 부호를 바꿔주는데 사용
		int num=0;
		
		//조건식의 값이 true이면 무한반복문이 된다.
		for(int i=1; true; i++, s=-s) { //매 반복마다 s의값을 1, -1 ,1 -1 .. 
			num = s*i; //i 와 부호 s를 곱해서 더할값을 구한다.
			sum+= num;
	/* for(int i = 1; 1<100; i++ s=-s){
	 	num = i*s;
	 	sum+= num;
	 
	 */
			
			if(sum>=100) // 총합이 100보다 같거나 그면 반복문을 빠져나온다
				break;
		}
				System.out.println("num="+num);
				System.out.println("sum="+sum);

	}

}
