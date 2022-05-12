package Practice;

import java.util.*;

class Studentt implements  Comparable{

	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Studentt(String name, int ban, int no, int kor, int eng, int math){
	this.name = name;
	this.ban = ban;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
}
	int getTotal(){
	return kor+eng+math;
}
	float getAverage(){
	return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	public String toString(){
	return name+", " +ban +", "+no+", "+kor   +","+eng+"," +math+", " +getTotal()+","+getAverage();
	}
	public int compareTo(Object o) {// 자신과 비교
	if(o instanceof Studentt){
	Studentt tmp = (Studentt)o;
	return name.compareTo(tmp.name); //String클래스의 compareTo()를 호출
	}else {
	return -1;
	}
}
}
	public class Exercise11_3{
	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(new Studentt("홍길동", 1,1,100, 100, 100));
	list.add(new Studentt("남궁성", 1,2,90,70,80));
	list.add(new Studentt("김자바", 1,3,80,80,90));
	list.add(new Studentt("이자바", 1,4,70,90,70));
	list.add(new Studentt("안자바", 1,5,60,100,80));
	
	Collections.sort(list); //List에 저장된 요소들을 정렬한다.(CompareTo()호출)
	Iterator it = list.iterator();
	while(it.hasNext())
	System.out.println(it.next());	
}

	}
