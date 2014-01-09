
/*
 * Best Time to Buy and Sell Stock
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 */

public class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0;

        if(prices.length>0){
            int minPrice = prices[0];
            for(int i=0; i<prices.length; i++) {
                // keep track of the highest profit
                // check whether you can get higher profit if you sell at this price
                if(profit < prices[i] - minPrice) {
                    profit = prices[i] - minPrice;
                }
                // keep track of the lowest price
                if(prices[i] < minPrice) {
                    minPrice = prices[i];
                }
            }
        }
        
        return profit;
    }
}
