package coll;

public class Ex01 {
	public static void main(String[] args) {
		
		String ex = "aaabbcccccca";
		
		for(int i=0; i<ex.length();i++) {
			if(i < ex.hashCode()) {
				i++;
				System.out.println(i);
			}
		}
		
		
	}
}
