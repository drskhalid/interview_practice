
public class MaxTreeDepth {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static int maxDepth(TreeNode root) {
		if (root != null) {
			int res = 1;
			int left = helper (root.left, res);
			int right = helper (root.right, res);
			if (left > right) return left;
			else return right;
		}
		return 0;
	}
	
	private static int helper (TreeNode root, int count) {
		if (root == null) return count;
		int a = helper (root.left, count + 1);
		int b = helper (root.right, count + 1);
		if (a>b) return a; else return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
