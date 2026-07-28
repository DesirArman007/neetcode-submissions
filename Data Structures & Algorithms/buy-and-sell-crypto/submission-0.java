class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int buy=prices[0];
        int n = prices.length;
        for(int i=1; i<n; i++){
            profit = Math.max(profit, prices[i]-buy);
            buy=Math.min(buy,prices[i]);

        }

        if(profit<0) return 0;

        return profit;
    }
}
