package Practice;

public class Lotto {
	public static void main(String[] args){
		
	int[] num = new int[45];

	for(int i =0; i<num.length; i++)
	num[i]=i+1;

	int temp=0; //두값을 바꿀 임시변수

	int j=0; //임의이 값을얻어서 저장할변수
	
	
	for(int i=0; i<6; i++){
	j=(int)(Math.random()*45);

	temp = num[i];
	num[i]=num[j];
	num[j]=temp;
}
	for(int i=0; i<6; i++)
	System.out.println(num[i]);

}
	
}

