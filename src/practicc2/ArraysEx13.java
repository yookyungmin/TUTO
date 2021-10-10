package practicc2;
// 16진수를 2진수로 변환하는 예제

class ArrayEx13{
	public static void main(String[] args) {
	
	char[] hex = { 'c', 'a', 'f', 'e'};

	String[] binary = { "0000", "0001", "0010", "0011"
						,"0100", "0101" ,"0110", "0111"
						,"1000", "1001", "1010", "1011"
						,"1100", "1101", "1110", "1111"};
	String result = " ";	

	for(int i= 0; i<hex.length; i++) {
		if(hex[i]  >= '0' && hex[i] <='9'){
			result += binary[hex[i]-'0']; //'8' -'0' 의 결과는 8이다.
		}else { //A-F이면
			result += binary[hex[i]-'a'+10]; // 'c'-'a' 결과는 2
		}
		}
			System.out.println("hex= "+new String(hex));
			System.out.println("binary:" +result);
	                                                                                                                                                                      
		
	}
	
}



