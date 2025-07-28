class Solution {
    public int maxProfit(int[] prices) {

        // Assume the first price is the minimum so far
        int min = prices[0];

        // Initialize profit to 0
        int profit = 0;
        
        // Iterate over the entire prices array
        for(int i = 0; i < prices.length; i++) {

            // Update min if current price is lower than previous min
            if(prices[i] < min){
                min = prices[i];
            } 
            
            // Calculate profit: current price - min so far
            // Update maximum profit if this profit is greater
            profit = Math.max(profit, prices[i] - min);
        }

        // Return the maximum profit possible
        return profit;
    }
}
