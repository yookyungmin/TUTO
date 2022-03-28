package practicc2;

import java.util.Arrays;
import java.util.Collections;
//오름차순
public class Array1 {

	public static void main(String[] args) {
		 int arr[] = {4,23,33,17,19};
		 String[] arr2 = {"apple", "orange", "banana", "pear","pedch", "melone"};
		 
		 
		 Arrays.sort(arr); // 오름차순
		 Arrays.sort(arr2, Collections.reverseOrder());
		 
		 for(int i : arr) {
			 System.out.println("["+i+"]");
		 }

		 for(String i : arr2) {
			 System.out.println("["+i+"]");
		 }
		 
	}

}
