package practicc2;
public class ArrayEx4 {

	public static void main(String[] args) {
		//char 형식 배열 ABCD
		char[] abc = {'A','b','c','d'};
				//char 형식 배열 0~9
		char[] num = {'0', '1', '2', '3', '4', '5' , '6', '7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc 와 num을 붙여서 하나의 배열 (result)로 만든다.
		char[] result = new char[abc.length+num.length];
		//abc 배열 0부터 result 배열0부터, abc모두 배열 복사
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc배열 num의 첫번쨰 위치부터 배열 abc 길이만큼복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		//System.arraycopy(src, srcPos, dest, destPos, length)
		/*src = 복사하고자 하는 소스, 원본
		  srcPos 위의 원본소스에서 어느부분부터 읽어올지 위츨 정해줌 처음부턴 0
		  dest = 복사할 소스입니다. 복사하려는 대상
		  destPos = 위의 복사본에서 자료를 받을때 어느부분부터 쓸것인지 시작위치 처음 0
		  length = 원본에서 복사본으로 데이터를 읽어서 쓸 데이터의 길이 / 
		*/
		
		//number인덱스 6위치에 3개를 복사		
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);

	}

}
   