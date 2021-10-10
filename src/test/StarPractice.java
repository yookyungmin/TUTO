package test;

class StarPractice{
	public static void main(String[] args) {
		

//Scanner sc = new  Scanner(System.in);

final int SIZE = 5; //sc.nextInt()



for(int i=1; i<=SIZE; i++){
for(int j=1; j<=SIZE; j++){
	if(i==j) {
		System.out.print("["+i+","+j+"]");
	}
	else System.out.print(" ");
}
System.out.println();
}
	}
}
	/*[1,1]    
		 [2,2]   
		  [3,3]  
		   [4,4] 
		    [5,5]*/
