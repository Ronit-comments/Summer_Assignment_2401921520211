class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxprofit = 0;
        while (sell < prices.length) {
            if (prices[sell] < prices[buy]) {
                buy = sell;
            } else {
                int current = prices[sell] - prices[buy];
                maxprofit = Math.max(maxprofit, current);
            }
            sell++;
        }
        return maxprofit;
    }
}