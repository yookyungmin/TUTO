package Practice;

class Ancestor{//조상
	int x;
	int y;
	
	//기본생성자 : public Ancestor() { } 
    public	Ancestor(){
        this(3, 8);
    }
	public Ancestor(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Descendants extends Ancestor {//자손
	int z;
	
	public Descendants(int x, int y, int z) {
	super(x,y);//부모 클래스의 해당 생성자 사용
	this.z= z;
	}
	public Descendants(int z){
	    super(3,4);
	    this.z= z;
	}
	public String toString(){
	    return "y="+y+"x="+x+"z="+z;
	}
}
public class Construc{
    public static void main(String[] args)   {
        Descendants des = new Descendants(1);
        System.out.println(des.toString());
        Descendants des1 = new Descendants(100,200, 400);
        System.out.println(des1.toString());
}
}