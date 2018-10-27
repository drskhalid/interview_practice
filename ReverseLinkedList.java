import java.util.Stack;

public class ReverseLinkedList {
	
	/**
	 * Definition for singly-linked list. */
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	    public ListNode reverseList(ListNode head) {
	    	Stack<ListNode> stk = new Stack<ListNode>();
	    	
	    	ListNode curr = head;
	    	
	    	while (curr != null) {
	    		stk.push(curr);
	    		curr = curr.next;
	    	}
	    	
	    	ListNode res = null;
	    	if (!stk.empty()) { 
	    		 res = stk.pop();
	    	}
	    	
	    	ListNode dummy = res;
	    	
	    	while (!stk.empty()) {
	    		dummy.next = stk.pop();
	    		dummy = dummy.next;
	    	}
	        return res;
	    }
	    
	    //less memory intensive 
	    public ListNode reverseList2(ListNode head) {
	    	
	    	if (head == null) return null;
	    	if (head.next == null) return head;
	    	
	    	ListNode curr = head;
        ListNode next = null;
	    	ListNode prev = null;
	    	
	    	while (curr != null) {
	    		next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                
	    	}
	    	
	    	
	        return prev;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
