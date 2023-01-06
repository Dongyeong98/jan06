package coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//Set interface
//순서가 없어요. 중복도 없어
public class Set01 {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(5); //중복 x
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(10);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(10));
		System.out.println(set.toArray());
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		//로또 만들어 주세요
		//1 game
		
		set.clear();
		
		while(set.size() < 6) {
		set.add((int) (Math.random() * 45) +1);
		}
		System.out.println(set);
		
		set.clear();
		Scanner sc = new Scanner(System.in);
		
		
		
	}
	

}
