package Practice;

public class Hello {
	

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			
			//짝수일떈 음수로 바뀌어야함 
			if(i%2!=0) {
//				System.out.println(i);
				sum += i;
			} else {
//				System.out.println(-i);	
				sum+= -i;
			}
			
			
			System.out.println(sum);
			
		}

	}

}
