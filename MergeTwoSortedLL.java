
public class MergeTwoSortedLL {
	
	
	 
	   class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	
	   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		   
		   ListNode l1curr = l1;
		   ListNode l2curr = l2;
		   ListNode l1temp = null, l2temp = null;
		   
		   while (l1curr != null) {
			   while (l2curr != null) {
				   if (l1curr.val < l2curr.val) {
					   l1temp = l1curr.next;
					   l1curr.next = l2curr;
				   } else {
					   l2temp = l2curr.next;
					   l2curr.next = l1curr;
				   }
			   }
		   }
		   
		   if (l1curr == null) {
			   
		   }
		   if (l2curr == null ) {
			   
		   }
		   
		   
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
