import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAtoi {
	
	public static int myAtoi(String str) {
		
		StringBuilder s = new StringBuilder();
		int i = 0;
		//checking for white spaces in beginning
		while (str.charAt(i) == ' ') {
			i++;
		}
		//we have a non white char
		//check what it is
		//first check for a minus sign OR if its too big
		if (str.charAt(i) == '-') {
			//negative number
			//check if its out of range
			//first extract number
			String pattern = "(\\d+)";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(str);
			int start = m.start();
			int end = m.end();
			//while (str.charAt(i) == )
			String num = str.substring(start, end);
			System.out.println(num);
			
		} else {
			//positive number
			//check if out of range 
			String pattern = "(\\d+)";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(str);
			int start = m.start();
			int end = m.end();
			//while (str.charAt(i) == )
			String num = str.substring(start, end);
			System.out.println(num);
		}
		
        return -1;
    }

	public static void main(String[] args) {
		String s = "42";
		myAtoi(s);

	}

}