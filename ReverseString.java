
public class ReverseString {
	
	 public static String reverseString(String s) {
	        String res = "";
	        
	        for (int i = s.length() - 1; i >= 0; i--) {
	        	res += s.charAt(i);
	        }
		 
		 return res;
	    }
	 
	 public static String reverseString2(String s) {
		 StringBuilder str = new StringBuilder();
		 str.append(s);
		 str.reverse();
		 return str.toString();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "saad";
		System.out.println(str.length());
		
		System.out.println(reverseString(str));
		System.out.println(reverseString2(str));

		
	}

}
