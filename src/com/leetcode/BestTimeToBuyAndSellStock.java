package com.leetcode;


/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/description
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // init - make currentMin huge to start so everything will be smaller
        int maxProfit = 0;
        int currentMin = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {
            // Update min if this is less than existing min
            if(prices[i] < currentMin) {
                currentMin = prices[i];
            }
            // Update maxProfit if the diff between current and min is greater than existing maxProfit
            if(maxProfit < (prices[i] - currentMin)) {
                maxProfit = prices[i] - currentMin;
            }
        }
        // Return maxProfit if it is positive, otherwise 0
        return maxProfit > 0 ? maxProfit : 0;
    }
}
