import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTrav {

	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) { return list; }
        q.offer(root);
        while ( !q.isEmpty()  ) {
        	int size = q.size();
        	List<Integer> temp = new ArrayList<>();
        	for (int i = 0; i < size; i++) {
        		TreeNode node = q.poll();
        		temp.add(node.val);
        		if (node.left != null) q.offer(node.left);
        		if (node.right != null) q.offer(node.right);
        	}
        	list.add(temp);
        }        
        return list;
    }
	
	public static void main(String[] args) {
		
		
		
	}

}

