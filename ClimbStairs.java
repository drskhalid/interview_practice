
public class ClimbStairs {
	
	public static int climbStairs(int n) {
        if(n<=1) {
            return 1;
        }
        int prev=1;
        int curr=1;
        for(int i=2;i<=n;i++) {
            int temp1 = curr;
            curr = curr+prev;
            prev = temp1;
        }
        
        return curr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(4));

	}

}
