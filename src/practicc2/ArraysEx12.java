package practicc2;
class ArraysEx12 {
	public static void main(String[] args) {

	String[] names = {"kim", "park", "yi", "y"}; //{"kim", "park","yi"};를가진 naems 배열생성
	
	//0부터 names 스트링배열 길이만큼 반복
	for(int i = 0; i<names.length; i++) {
		System.out.println("name["+i+"]:"+names[i]);
	}
	
	String tmp = names[2]; // 배열 세번째 요소를 tmp에저장 0,1,2
	System.out.println("tmp="+tmp);
	names[0]= "yu"; // 배열name의 첫번째요소를 yu로 변경
	
	for(String str :names) // 향상된for문
	System.out.println(str);
	
	

}//main
}

