package practicc2;
//string 클래스의 charAt(int idx)

class ArrayEx14{
	public static void main(String[] args){
	
	String src = "ABCED";

	for(int i=0; i<src.length(); i++){
	char ch = src.charAt(i); // src i번째 문자를 ch에 저장
	System.out.println("src.charAt("+i+"):"+ch);
	}

	//String을 char[]로 변환
	char[] chArr = src.toCharArray();

	//char 배열 (chaar[])을 출력
	System.out.println(chArr);
	

}

}