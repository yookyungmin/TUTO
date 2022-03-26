import practicc2.if_1;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship =new Dropship();

			Marine marine = new Marine();
			
			SCV scv = new SCV();
			scv.repair(tank);
			scv.repair(dropship);
			//scv.repair(marine); // 에러 Repairalbe을구현을안해서 
			
		
	}

}

interface Repairable{}

class Unit{
	int hitPoint; //현재 체력
	final int MAX_HP; //최고체력
	
	Unit(int hp){
		MAX_HP=hp;
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp) {
		super(hp); //조상 클래스의 생성자
	}
}

class AirUnit extends Unit{
	AirUnit(int hp) {
		super(hp);//조상클래스의 생성자
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);//TANK HP=150
		hitPoint=MAX_HP;
	}
	
	public String toString() {
		return "TANK";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125); //Dropship 의 hp는 125
		hitPoint=MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}
class Marine extends GroundUnit {
	Marine(){
		super(40);
		hitPoint=MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint=MAX_HP;
	}
	void repair(Repairable r) { //Repairalbe 구현한 클래스의 객체만 들어올수 잇따
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) { //현재체력과 최고체력이 같지 않으면
				/*Unit 의 hp를 증가시킨다*/
				u.hitPoint++;
			}
			System.out.println(u.toString()+"수리는 끝났습니다");
		}
	}
	
}













