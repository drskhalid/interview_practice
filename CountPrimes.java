
public class CountPrimes {
	
	public static int countPrimes(int n) {
		if (n==2 || n==3) return 1;
		int count = 0;
		if (n==4) return 2;
		if (n==5 || n==6) return 3;
		if (n==7 || n==8) return 4;
		
		for (int i=9;i<n;i++) {
			if (i%2 == 0 || i%3 == 0 || i%5 == 0 || i%7==0) {
				
			}
			count++;
		}
		return count;
	}

	public static boolean isPower(int n) {
		for (int i=2;i<(n/3);i++) {
			if (i*i*i == n) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long  t =(1/3);
		System.out.println(t);
	}

}
