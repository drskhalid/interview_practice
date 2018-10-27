
public class SortedArrayToBST {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	private static TreeNode helper(int[] nums, int l, int r){
	    if (l>r) return null;
	    else if (l==r) return new TreeNode(nums[l]);
	    else {
	    	int mid = (l+r)/2;
	    	TreeNode root = new TreeNode(nums[mid]);
	    	root.left = helper(nums,l,mid-1);
	    	root.right = helper(nums,mid+1,r);
	    	return root;
	    }
	  }
	
	public static TreeNode sortedArrayToBST(int[] nums) {
	    return helper(nums, 0, nums.length-1);
	  }

	public static void main(String[] args) {
		int[] a = {-10,-3,0,5,9};
		TreeNode res = sortedArrayToBST(a);
		

	}

}