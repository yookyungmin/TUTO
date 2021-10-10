package practicc2;
class ArraysEx12 {
	public static void main(String[] args) {

	String[] names = {"kim", "park","yi"};
	for(int i=0; i<names.length; i++){
	System.out.println("names["+i+"]="+names[i]);
}
	String tmp = names[2]; // 배열 세번째 요소를 tmp에저장
	System.out.println("tmp="+tmp);
	names[0]= "yu"; // 배열name의 첫번째요소를 yu로 변경
	
	for(String str :names) // 향상된for문
	System.out.println(str);
}//main
}

