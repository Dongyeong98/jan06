package coll;
//다시 바꿔봤어요 
public class KeyMaker {
   private final static String pattern = "annna-aaaaa-aaana-nanan-annaa";
   private final static int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
   private final static char[] alpa = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
         'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

   public String makeKey() {
     // String key = "";
	   
	   
	   StringBuilder sb = new StringBuilder();
	   
      for (int i = 0; i < pattern.length(); i++) {
         if (pattern.charAt(i) == 'a') {
            sb.append(alpabet());
         } else if(pattern.charAt(i) == 'n'){
        	 sb.append(number());
         } else {
        	 sb.append("-");
         }
      }
      return sb.toString();
   }

   private int number() {
      //각 배열의 길이만큼 돌게 변경
      return (int) (Math.random() * number.length);
   }

   private char alpabet() {
      //각 배열의 길이만큼 돌게 변경
      return alpa[(int) (Math.random() * alpa.length)];
   }

   public static void main(String[] args) {
      KeyMaker key = new KeyMaker();
      String result = key.makeKey();
      System.out.println(result);
   }
}

