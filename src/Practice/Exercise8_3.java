package Practice;
class NumberException extends Exception {}
class InvalidNumberException extends NumberException {}
class NotANumberException extends NumberException {}

class Parent{
	int a;
	int b;
	Parent(){
	this(0,0);//기본값
	}
	Parent(int a, int b) {
	this.a = a;
	this.b= b;
	}
	void add(int a, int b) 
	throws InvalidNumberException, NotANumberException{}
}
	class Child extends Parent{
	Child() {}
	Child(int a, int b) {
	super(a,b);
}
	void add(int a, int b)
throws InvalidNumberException, NotANumberException {}
}

// 해설 오버라이딩 을 할 때 (overriding) , 조상 클래스의 메서드보다 많은 수의 예외를 선
//언할 수 없다.

//오버라이딩 throws Exception은 최고조상이므로 예외의 갯수는 적거나 같아야한다 불충족 