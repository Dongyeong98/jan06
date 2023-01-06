package coll;

public class Milli {  //몇초가 걸린지 찍어주는거다.
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for (int i =0; i <3000; i++) {
			System.out.println(i);
		}
		System.out.println("!");
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
	}
}
