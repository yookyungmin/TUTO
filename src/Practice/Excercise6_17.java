package Practice;
class Exercise6_17
{
	public static int[] shuffle(int[] arr) { //int[]배열을 매개변수로 받아서 배열에 저장된 각 요소도들의 위치를 여러번 바궈서 섞은 변환하는 메서드
	if(arr== null || arr.length==0) //arr null값이거나 길이가 0이면 arr반환
	return arr;

	for(int i= 0; i<arr.length; i++) {
	int j=(int)(Math.random()*arr.length);
	
	//arr[i]와 arr[j]의 값을 서로 바꾼다
	
	int tmp = arr[i];
	arr[i]= arr[j];
	arr[j] = tmp;
}
	return arr;
}





	public static void main(String[] args)
{
	int[] original ={ 1,2,3, 4, 5,6,7,8,9};
	System.out.println(java.util.Arrays.toString(original));

	int[] result = shuffle(original);
	System.out.println(java.util.Arrays.toString(result));
	}
}
/*메서드명 : shuffle
기 능 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다 : .
처리한 배열을 반환한다.
반환타입 : int[]
매개변수 정수값이 담긴 배열 */