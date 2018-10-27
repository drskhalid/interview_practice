
public class BraceChecker {
	
	public static boolean isValid(String braces) {
		if (braces == null) return false;
		
		//length > 0 and not null
		char curr = braces.charAt(0);
		
		switch(curr) {
			case '(': 
				String t = getSub(braces, ')' );
				int t_index = getIndex(braces, ')' );
				System.out.println(t);
				System.out.println(braces.indexOf(t_index));
				//System.out.println();
			case '[': 
				
			case '{':
				
		}
		
		return false;
	}
	
	private static String getSub(String sub, char c) {
		int counter = 0;
		while ( counter < sub.length() ) {
			if (sub.charAt(counter) == c) {
				 break;
			} else {
				counter++;
			}
		}
		return sub.substring(0, counter+1);
	}

	private static int getIndex(String sub, char c) {
		int counter = 0;
		while ( counter < sub.length() ) {
			if (sub.charAt(counter) == c) {
				 break;
			} else {
				counter++;
			}
		}
		return counter+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(s.substring(0, 3));
		
		String temp = "([] {}))";
		isValid(temp);
		
		
	}

}
