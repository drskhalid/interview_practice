
public abstract class FirstBadVersion {
	/* The isBadVersion API is defined in the parent class VersionControl.
	 * 
    boolean isBadVersion(int version); 
    */
	public abstract boolean isBadVersion(int version);
	
	public int firstBadVersion(int n) {
        int l = 0;
        int r = n;
        while (l<r) {
        	int mid = l + (r-l) /2 ;
        	if (isBadVersion(mid)) {
        		r = mid;
        	} else {
        		l = mid +1;
        	}
        }
        return l;
    }
	public static void main(String[] args) {
		
		
	}

}
