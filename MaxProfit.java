
public class MaxProfit {
	
	public static int maxProfit(int[] prices) {
		int buy = 0;
		int sell = 0;
		int profit = 0;
		if (prices.length == 0 || prices.length == 1) return 0;
		buy = prices[0];
		sell = prices[1];
		profit = sell-buy;
		for (int i=0;i<prices.length-1;i++) {
			for (int j=1;j<prices.length;j++) {
				if ( prices[j]-prices[i] > profit) {
					profit = prices[j]-prices[i];
					buy=prices[i];
					sell=prices[j];
				} 
			}
		}
		if (profit > 0) return profit;
		else return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
