package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("김길동");
		set.add("최길동"); //중복이라 입력x
		set.add("박길동");
		set.add("홍길도");
		set.add("이길도");
		set.add("최길동"); 
		
		System.out.println(set.size());
		System.out.println(set);
		//List로 바꾸기
		
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);
		
		//가나다라 순으로 정렬
		Collections.sort(list);
		
		for (String str : list) {
			System.out.println(str);
		}
		for (int i=0; i <list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
