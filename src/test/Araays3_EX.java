package test;
import java.util.Arrays;

public class Araays3_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] iArr1= new int[10];
		 int[] iArr2= new int[10];
//		 int[] iArr3= new int[]{100, 95, 90, 70, 60};;
		 int[] iArr3= {100, 95, 90, 70, 60};
		 char[] chArr= {'a', 'b', 'c', 'd'};
		 
		 for(int i=0; i<iArr1.length; i++) {
			 iArr1[i] = i+1; // 1~10���ڸ� ������� �迭�� ���´�.
		 }
		 for(int i=0; i<iArr2.length; i++) {
			 iArr2[i] = (int)(Math.random()*10)+1;  //1~10 �迭�� ��
		 }
		 //�迭�� ����� ������ ���
		 for(int i=0; i<iArr1.length; i++) {
			 System.out.print(iArr1[i]+ ",");   //1,2,3,4,5,6,7,8,9,10,
		 }
		
           System.out.println();
           
           System.out.println(Arrays.toString(iArr2)); //[10, 9, 4, 9, 5, 10, 6, 7, 5, 3] 
           System.out.println(Arrays.toString(iArr3)); //[100, 95, 90, 70, 60]
           System.out.println(Arrays.toString(chArr)); //[a, b, c, d]
           System.out.println(iArr1);//[I@41a4555e
           System.out.println(iArr2);// [I@3830f1c0
           System.out.println(iArr3); // [I@41a4555e  41a4555e = �ּҰ�  
           System.out.println(chArr); //abcd  charĳ���� �迭�ΰ�� ����Ʈ ���� ���

	
	}
	

}
