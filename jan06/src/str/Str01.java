package str;

import java.util.Arrays;
import java.util.List;

public class Str01 {
	public static void main(String[] args) {
		
		String str = "100";
		
		String str2 = new String("100");
		
		char ch = 'A';
		str = str + ch + 150; //연결
		
		System.out.println(str);
		
		
		str2 = "A" + 127;
		//문자 + 숫자 = 문자
		//문자 + 문자 = 문자
		//숫자 + 문자 = 문자
		System.out.println(str2);
		
		str2 = 1+ 2+ 3+ "A";
		System.out.println(str2); //6A
		
		str2= "2"+1+2+3+"A";
		System.out.println(str2); //2123A
		str2= "2"+ (1+2+3) +"A";
		System.out.println(str2); //26A
		
		str2 = "안녕하세요";
		
		char[] hi = str2.toCharArray();
		System.out.println(Arrays.toString(hi));
		//[안,녕,하,세,요]
		
		System.out.println(str2.charAt(0));
		System.out.println(str2.indexOf("안")); //0 몇번째 위치
		System.out.println(str2.indexOf("가")); //-1 아예 없는건 -1
		
		List<String> hiList = Arrays.asList(str2);
		System.out.println(hiList);
		//[안녕하세요]
		
		String str3 = new String(hi, 1, 2);
		System.out.println(str3);
		
		str3 = "gdfgafdtigfdsmgaoweptgfjgdfhntwqiuno";
		System.out.println("j가 몇개일까?");
		int count =0;
		for(int i =0; i< str3.length();i++) {
			if(str3.charAt(i) =='j') {
				count +=1;
			}
		}
		System.out.println("총" + count + "개");
		
		str3 = "Hi5";
		System.out.println(Character.isAlphabetic('A'));
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('A'));
		
		System.out.println(Character.isAlphabetic(str3.charAt(0)));
		System.out.println(Character.isAlphabetic(str3.charAt(1)));
		System.out.println(Character.isAlphabetic(str3.charAt(2)));
		
		System.out.println(str3.contains("cat"));
		System.out.println(str3.contains("HI")); //포함 하고있는지
		
		str3 =str3.concat("입니다.");
		System.out.println(str3); //Hi5입니다.
		
		System.out.println(str3.endsWith("니다"));
		String email = "wisejia@naver.com";
		System.out.println(email.endsWith(".com"));
		
		String str1 = new String ("Hi");
		str2 = new String ("Hi");
		System.out.println(str1 == str2);
		//불변성 , immortal
		System.out.println(str1.equals(str2));
		
		str1 = "안녕하세요";
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append("날씨가 참 좋네요");
		sb.append("하하하하하하;;;");
		
		System.out.println(sb.toString());
		
		System.out.println(email.indexOf("@"));
		
		String str4= email.substring(0,7);
		System.out.println(str4);
		String server = email.substring(8,email.length());
		System.out.println(server);
		
		//여러분들 email을 넣어주세요
		//id와 도메인으로 분리해주세요.
		email = "poseidon@kakao.com";
		String id = email.substring(0, email.indexOf("@"));
		server = email.substring(email.indexOf("@") +1, email.length());
		System.out.println(id);
		System.out.println(server);
		
		
	}

}
