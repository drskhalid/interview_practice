import java.util.HashMap;

public class FirstUniqueChar {
	
	public static int firstUniqChar(String s) {
        
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			} else {
				hm.put(s.charAt(i), 1);				
			}
		}		
		for (int i = 0; i < s.length(); i++) {
			if ( hm.get( s.charAt(i) ) == 1 ) {
				return i;
			}
		}
		return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "leetcode";
		String str2 = "loveleetcode";
		
		System.out.println(firstUniqChar(str));
		System.out.println(firstUniqChar(str2));

	}

}
