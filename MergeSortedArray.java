
public class MergeSortedArray {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0 || nums2.length == 0 ) return;
        
        int i=0,j=0,k=0;
        int temp = 0;
        int s = m+n-1;
        while (i < s ) {
        	if (nums1[i]<=nums2[j]) {
        		if (nums1[i]==0) nums1[i]=temp;
        		i++;
        	} else {
        		temp = nums1[i];
        		nums1[i]=nums2[j];
        		j++;
        		i++;
        		
        	}
        }
        
    }
	
	public static void main(String[] args) {
		
		
	}

}
