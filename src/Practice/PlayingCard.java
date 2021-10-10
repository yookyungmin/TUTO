package Practice;
class PlayingCard{
	int kind;
	int num;
	
	static int width;
	static int heigth;

	 
	PlayingCard(int k, int n){
	kind = k;
	num = n;
	}

	public static void main(String arg[]) {
	PlayingCard card = new PlayingCard(1,1);	
}
}
/*- (static ) : width, height 클래스변수 변수
- : kind, num 인스턴스변수
- : k, n, card, args 지역변수*/

