package Practice;

public class Exercise8_4 {
static void method(boolean b) {
try {
System.out.println(1);
if(b) throw new ArithmeticException(); // 예외발생 정수를 0으로 나눔
System.out.println(2); // 예외가 발생하면 실행되지 않는 문장
} catch(RuntimeException r) { //ArithmeticException()의 부모 
System.out.println(3);
return; // .(finally ) 메서드를 빠져나간다 블럭을 수행한 후에
} catch(Exception e) {
System.out.println(4);
return;
} finally {
System.out.println(5); // 예외발생여부에 관계없이 항상 실행되는 문장
}
System.out.println(6);
}
public static void main(String[] args) {
method(true);
System.out.println();
method(false);
} // main
}

/* 해설 예외가 발생하면 가 출력되고 예외가 발생하지 않으면 이 출력된다 1,3,5 , 1,2,5,6 .
ArithmeticException RuntimeException RuntimeException 은 의 자손이므로 이 정의된
catch . catch return 블럭에서 처리된다 이 블럭에 문이 있으므로 메서드를 종료하고 빠져나
가게 되는데 이 때도 블럭이 수행된다 , finally .

*/