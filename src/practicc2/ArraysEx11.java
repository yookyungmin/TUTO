package practicc2;/*길이가 10인 배열을 만들고 0과 9사이의 값으로 초기화한다. 그리고 이배열에서 
저장된 각숫자가 몇번 반복해서 나타나는지 세어배열 counter 다음 다음 화면에 출력 */

class ArraysEx11{
	public static void main(String[] args){
	
		int[] numArr = new int[10];
		int[] counter = new int[10];
	
		for(int i = 0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10); // 0~9 임의수를 배열에저장
			System.out.print(numArr[i]); // 출력
		}
	
		System.out.println();
		for(int i=0; i<numArr.length; i++) {
			counter[numArr[i]]++; //  위에서 출력된게 4446579753에서 numArr[0] 0인경우에 4, count[4]의값을 1증가
		}
		for(int i=0; i<numArr.length; i++) {
			System.out.println(i+"의 개수:" +counter[i]);
		}
/*  4446579753
 0의 개수 : 0
1의 개수 : 0
2의 개수 :0
3의 개수 : 1
4의 개수 : 3
.
.
.
*/ //이렇게 나옴



}
}