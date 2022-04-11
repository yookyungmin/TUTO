package Problem5;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashEx11_17 {
	public static void main(String[] arg) {
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		Set set =map.entrySet(); //키와 밸류값을 Set으로 변환 키,밸류모두 출력시
		
		Iterator it = set.iterator();  //맵에는 Iterator가 없어서 셋에서접근
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); //Entry타입으로 e객체를 만든
			
			System.out.println("이름:"+e.getKey()+", 점수:"+e.getValue());

		}
		set= map.keySet();
		System.out.println("참가자 명단"+set);
		
		Collection values = map.values();  //value만 가져오기
		Iterator it2 = values.iterator();
		
		int total=0;
		
		while(it2.hasNext()) {
			total+=(int)it2.next();
		}
		System.out.println("점수리스트"+values);
		System.out.println("총점"+total);
		System.out.println("최고점수= "+Collections.max(values));
		System.out.println("최저점수= "+Collections.min(values));
		
		}
	}

