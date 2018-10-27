
public class SingleNumber {
	
	 public static int singleNumber(int[] nums) {
		 int res = 0;
		 for (int i=0; i<nums.length; i++) {
			 res ^= nums[i];
		 }
		 return res;
	    }

	public static void main(String[] args) {
		int[] test1 = {2,2,1};
		int[] test2 = {4,1,2,1,2};
		
		System.out.println(singleNumber(test1));
		System.out.println(singleNumber(test2));
	}

}
