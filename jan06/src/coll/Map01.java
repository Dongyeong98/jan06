package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map<K, V> : Key 중복 X , Value 중복 가능
public class Map01 {
	public static void main(String[] args) {
		//E, T, K, V
		Map<String, Integer> map = new HashMap<String, Integer>();
		//저장 put(K, V)
		
		map.put("홍길동", 23);
		map.put("김길동", 30);
		map.put("이길동", 20);
		map.put("박길동", 10);
		map.put("최길동", 50);
		map.put("홍길동", 100); //중복은 덮어씌워진다.
		
		System.out.println(map.size());
		System.out.println(map);
		
		Map<String, String> map2 = new HashMap<String,String>();
		map2.put("홍길동", "박나래"); //뒤에 있는데 V인데 value는 중복되도 출력된다. 앞에있는 Key만 다르게해야한다.
		map2.put("길동", "박나래");
		map2.put("박길동", "박나래");
		map2.put("장길동", "박나래");
		map2.put("연길동", "박나래");
		
		System.out.println(map2);
		
		//출력 get(K)
		System.out.println(map.get("이길동")); //이길동이 가지고 있는 숫자 
		System.out.println(map.get("없는거")); //없다 null로 출력
		
		//이런키가 있는지 물어보기
		System.out.println(map.containsKey("이길동"));
		System.out.println(map.containsKey("없는거"));
		
		//이런 value가 있는지 물어보기
		System.out.println(map.containsValue(100));
		System.out.println(map.containsValue(1000));
		
		//지우기 remove(K)
		System.out.println(map.remove("이길동"));
		System.out.println(map);
		
		System.out.println(map.size());
		
		//1. map -> set ->list
		//2. map ->set == iterator
		
		Set<String> map2set = map.keySet(); // map.keySet : 키만 뽑아서 set 타입으로 만들어준다. 결론으론 map.keySet도 set타입이다.
		
		System.out.println(map2set);
		//[박길동, 김길동, 홍길동, 최길동]
		
		List<String> set2List = new ArrayList<String>(map.keySet());
		System.out.println(set2List);
		
		for (int i=0; i<map.size();i++) {
			System.out.print("K :" + set2List.get(i) );
			Integer value =map.get(set2List.get(i));
			System.out.println(" V :" + value);
		}
		
		List<String> map2List =new ArrayList<String>(map2.keySet());
		System.out.println(map2List);
		for(int i =0; i < map2List.size();i++) {
			System.out.print("K : "+map2List.get(i));
			String value = map2.get(map2List.get(i));
			System.out.println(" V : " + value);
		}
		
		//이렇게 쓰는게 추세다. 전혀이해안감,, ㅋㅋㅋ 아...
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.print("K : "+key);
			System.out.println(" V : " + map.get(key));
		}
		
	}

}
