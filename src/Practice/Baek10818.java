package Practice;

import java.util.Scanner;

import practicc2.if_1;

public class Baek10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] num = new int[N];
		
		int max=-100000;
		int min = 100000;
		
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
			if(num[i]>=max){
				num[i]=max;
			}
			if(num[i]<=min){
				min=num[i];
			}
			
		}
		System.out.println(min+" "+max);
	}

}
