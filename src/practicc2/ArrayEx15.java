package practicc2;
//문자열을 모르스 부호로 변환하는 예제

class ArrayEx15{
	public static void main(String[] args) {
	
	String source = "soshelp";

	String[] morse = {".-",

			};

	String result= " ";

	for(int i=0; i<source.length(); i++) {
	result +=morse[source.charAt(i)-'A'];

}

	System.out.println("source=" +source);
	System.out.println("morse="+result);


	
}

}