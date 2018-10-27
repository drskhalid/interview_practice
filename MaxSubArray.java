public class MaxSubArray {
	public static int maxSubArray(int[] A) {
	    int maxSoFar=A[0], maxEndingHere=A[0];
	    for (int i=1;i<A.length;++i){
	    	maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
	    	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
	    }
	    return maxSoFar;
	}
	//without math.max 
	public int maxSubArray2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int maxNum = nums[0];
        int subSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            subSum = subSum+nums[i] > nums[i]? subSum+nums[i] : nums[i];
            if (subSum > maxNum) maxNum = subSum;
        }
        
        return maxNum;
    }
	
	public static void main(String[] args) {
		int[] a= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(a));
	}
}