public class HasCycle {
	
	class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	
	public static boolean hasCycle(ListNode head) {
		
		if (head == null || head.next == null) return false;
        
		ListNode fast = head;
		ListNode slow = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
    }

	public static void main(String[] args) {
		
		

	}

}
