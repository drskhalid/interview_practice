import java.util.Stack;

public class RotateArray {
	
	public static void rotate(int[] nums, int k) {

		if (k == 0 || nums == null || nums.length == 0 ){
			return;
		}
		k %= nums.length;
        Stack<Integer> stc = new Stack<Integer>();
        for (int i=nums.length-1; i > (nums.length-1) - k; i--) {
        	stc.push(nums[i]);
        }
        int j = 1;
        int s = nums.length-1;
        int i=(nums.length-1) - k;
        while ( i >= 0 ) {
        	
            	nums[s] = nums[i];
            	i--;s--;
            
        }
        
        for (int p=0; p < k; p++) {
        	System.out.println("value of p beginning is: " + p);
        	nums[p] = stc.pop();
        }
        
    }
	
	private static void printIntegerArray(int[] arr) {
		for (int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println("END");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {1,2,3,4,5,6,7};
		int k = 3;
		// Output: [5,6,7,1,2,3,4]
		//Explanation:
		//rotate 1 steps to the right: [7,1,2,3,4,5,6]
		//rotate 2 steps to the right: [6,7,1,2,3,4,5]
		//rotate 3 steps to the right: [5,6,7,1,2,3,4]
		//rotate(test1, k);
		//printIntegerArray(test1);
		
		int[] test2 = {-1,-100,3,99};
		int k2 = 2;
		//Output: [3,99,-1,-100]
		//Explanation: 
		//rotate 1 steps to the right: [99,-1,-100,3]
		//rotate 2 steps to the right: [3,99,-1,-100]
		rotate(test2, k2);
		printIntegerArray(test2);
	}

}
