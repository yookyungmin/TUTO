package Practice;

class Exercise6_20 {
	public static int max(int[] arr) {
	if(arr==null || arr.length==0)
	return -999999;

	int max = arr[0]; //배열의 첫번째값으로 최대값을 초기화 한다.

	for(int i = 1; i< arr.length; i++) { //배열의 두번째 값부터 비교한다.
	if(arr[i] >max)// 배열의 i번째 요소가 max보다 크면
	max=arr[i];
}
	return max; // 반복문을 다돌면 max에는 배열의 요소 중 가장 큰값이 저장되어있을것, 이값을 반환
}
	public static void main(String[] args)
	{	
	int[] data = {3,2,9,4,7};
	System.out.println(java.util.Arrays.toString(data));
	System.out.println("최대값:"+max(data));
	System.out.println("최대값:"+max(null));
	System.out.println("최대값:"+max(new int[]{})); // 크기가 0인배열




}
}