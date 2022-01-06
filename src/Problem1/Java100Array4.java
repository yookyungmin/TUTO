package Problem1;
import java.util.Arrays;

public class Java100Array4{
        public static void main(String[] args){
int[] ar = {1,2,3,4,5};
int[] ar2 = {1,2,4,8,50, 9, 15, 10, 24};

//3부터 3개를 ar2 index 4, 50부터 붙여넣기
// {1, 2, 4, 8, 3, 4, 5, 15, 10, 24}  // 50 9 15 삭제
System.out.println(Arrays.toString(ar));  // 
System.arraycopy(ar, 2, ar2, 4, 3);


//ar 배열 인덱스 2에서 세개를 ar2 인덱스 4로 복사
System.out.println(Arrays.toString(ar2));


int[] a = {31,24,58,8,87,36,44,24,94,84,64};
int[] b= {3,5,8,7,9,10,15,16,25,42,50};

System.arraycopy(a, 3, b, 5,3);
System.out.println(Arrays.toString(b));
}
}
