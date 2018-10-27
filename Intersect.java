import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Intersect {
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		int[] result = {};
        if (nums1 == null || nums2 == null) return result ;
        Queue<Integer> q = new LinkedList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //now that both are sorted,
        int z = 0;
        int j = 0;
        for ( int i = 0 ; i < nums1.length ; i++ ) {
        	/*
        	 * if equal, add to queue, increment j and break to outer most loop
        	 * 
        	 * if nums1 < nums2 do not increment j, we need to increment i, we do this
        	 * by breaking to the outer most loop
        	 * 
        	 * if nums1 > nums2, we want to increment nums2, so increment j and continue
        	 * the inner most loop 
        	 * */ 
        	while ( j < nums2.length)  {
        		if (nums1[i] == nums2[j]) {
        			q.add(nums2[j]);
        			j++;
        			break;	
        		} else if (nums1[i] < nums2[j] ) {
        			break;
        		} else {
        			j++;
        		}
        	}
        }
        result = new int[q.size()];
        while (q.peek() != null) {
        	result[z++] = q.poll();
        }
        return result; 
    }

	private static void printArray(int[] a ) {
		for (int i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//Input: nums1 = [1,2,2,1], nums2 = [2,2]
		//		Output: [2,2]
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] answer = intersect(nums1, nums2);
		printArray(answer);
		//System.out.println(answer.toString());
	}

}
