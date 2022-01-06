package Problem1;

import java.util.Arrays;


public class Java100Arrays5 {
	public static void main(String[] args) {
		
		
		String[] nation = {"한국","미국","일본","러시아","중국","캐나다", "크로아티아"};
		
		String[] nation2 = {"북한","우크라이나","영국","독일","프랑스","체코"};
		
		System.out.println(nation);
		System.out.println(nation[2]);
		System.out.println(Arrays.toString(nation));//[한국, 미국, 일본, 러시아, 중국]
		
		for (int i=0; i<nation.length; i++) {
			System.out.print(nation[i]+ " ");//한국미국일본러시아중국
		}
		System.out.println();
		
	for(String s:nation) {
		System.out.print(s+" ");
		
	
	}
		System.arraycopy(nation, 2, nation2, 3, 2);
		System.out.print(Arrays.toString(nation));
		System.out.print(Arrays.toString(nation2));
	}

	
	
}
