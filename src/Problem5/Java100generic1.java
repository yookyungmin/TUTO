package Problem5;
// 제네릭 포괄적인
class Samplee<T> {
	private T obj;
	Samplee(T x) {
		this.obj = x;
	}
	T getObj() {
		return obj;}
	

	void printInfo() {
		System.out.println(obj.getClass().getName());
	}
}
public class Java100generic1 {

	public static void main(String[] args) {
			//[1]객체생성 -String

		Samplee<String> s1 = new Samplee<String>("안녕하세요~");
		System.out.println(s1.getObj());
		s1.printInfo();
		System.out.println("----------");
		
		//[2]객체생성
		Samplee<Integer> s2 = new Samplee<Integer>(100);
		System.out.println(s2.getObj());
		s2.printInfo();
		System.out.println("---------");
		//[3] 형변환 없이 사용하기
		
//		String str = s1.getObj();
//		System.out.println(str.length()); //6
		System.out.println(s1.getObj().length());
		System.out.println(s2.getObj());
	}

}
