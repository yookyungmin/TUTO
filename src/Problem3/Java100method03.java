package Problem3;

public class Java100method03 {

	public static int returnMethod() {
	
		int ret = 100;
		ret*=100;
		
		return ret;  //--- 10000
	} 	//retunmethod 메소드 작성
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[1] 반환값--> o , 받는 인자값x
		//반환값이 있다는것은 메서드(함수) 호출에 따른 리턴값이 있는것이므로 호출시 리턴값을 받
		
		int rst;
		rst = returnMethod();

		
		//[2] 출력
		System.out.println("메서드 호출에 따른 리턴된값은="+rst);
	}

}
