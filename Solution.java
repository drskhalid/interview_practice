import java.lang.reflect.Array;
import java.util.HashMap;

public class Solution {
	
	
//	    public int singleNumber(int[] nums) {
//	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//	        for (int i=0;i<nums.length;i++){
//	            map.put(arg0, arg1)
//	        }
//	    }
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,1,2,3,4,5,6};
		for (int i: a) {System.out.print (i + " "); }
		
		System.out.println();
		System.out.println(a.length);

		int k = 3;
		int temp;
		for (int j=0; j < k; j++) {
			for (int l = a.length-1; l > 0; l--) {
				temp = a[l];
				a[l] = a[l-1];
				a[l-1] = temp;
			}
		}
		
for (int i: a) {System.out.print (i + " "); }
		
		System.out.println();
		
		
		
		
	}

}
