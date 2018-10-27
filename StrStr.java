
public class StrStr {
	
	public static int strStr(String haystack, String needle) {
        
		if (needle.length()==0)return 0;
		if (haystack.indexOf(needle) != -1) {
			return haystack.indexOf(needle);
		} else {
			return -1;
		}	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
