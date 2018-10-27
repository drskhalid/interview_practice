public class ValidBST {
	
	public boolean isValid(TreeNode root, Integer min, Integer max) {
	    if(root == null) return true;
	    if(min != null && root.val <= min) return false;
	    if(max != null && root.val >= max) return false;
	    
	    return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
	}
	
	class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		TreeNode(int x) { val = x;}
	}
	public boolean isValidBST(TreeNode root) {
		if (root != null) {
			return helperBST(root);
		}		
		return false;
	}
	private boolean helperBST (TreeNode root) {
		if (root.left == null && root.right == null) {
			//leaf node 
			return true;
		}
		if (root.left == null) {
			if ( root.right.val > root.val) {
				return true && helperBST(root.right);
			} else {
				return false;
			}
		}
		if (root.right == null) {
			if ( root.left.val > root.val) {
				return true && helperBST(root.left);
			} else {
				return false;
			}
		}
		if (root.left.val < root.val && root.right.val > root.val) {
			return true && helperBST(root.left) && helperBST(root.right);
		} else {
			return false;
		}	
	}
	public static void main(String[] args) {		
		
	}
}