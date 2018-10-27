import java.util.Arrays;

public class InterSecIIArrays {
	
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        int count = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j = 0;
        int placeholder = 0;
        for (int i = 0; i<nums1.length; i++) {
        	j = placeholder;
        	while (j < nums2.length) {
        		
        		if (nums1[i]==nums2[j]) {
        			count++;
        			j++;
        			placeholder = j;
        			break;
        		}
        		j++;
        	}
        }        
		int[] res = new int[count];
		 j = 0;
		 int l = 0;
         placeholder = 0;
        for (int i = 0; i<nums1.length; i++) {
        	j = placeholder;
        	while (j < nums2.length) {
        		
        		if (nums1[i]==nums2[j]) {
        			res[l] = nums1[i];
        			j++;
        			l++;
        			placeholder = j;
        			break;
        		}
        		j++;
        	}
        }
	return res;
    }

	public static void main(String[] args) {
		int[] a = {3,1,2};
		System.out.println(a.length);
		int[] b = {1,3};
		int[] c = intersect(a,b);
		for (int h: c) {System.out.print(h + " ");}
		System.out.println();	
	}
}