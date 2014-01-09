/*
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 *
 * Note:
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 *
 * 第一步扫描，先计算出子序列[0,...,i]中的最大利润，用一个数组保存下来，那么时间是O(n)。
 * 第二步是逆向扫描，计算子序列[i,...,n-1]上的最大利润，这一步同时就能结合上一步的结果计算最终的最大利润了，这一步也是O(n)。
 * 所以最后算法的复杂度就是O(n)的。
 */

public class BestTimeBuySellStockIII {
    public int maxProfit(int[] prices) {

        // empty array gives no profit.
        if(prices.length == 0) {
            return 0;
        }
        
        int[] profit1 = new int[prices.length];
        int[] profit2 = new int[prices.length];;
        
        // find the max profit of subarray [0, ... , i]
        int profit = 0;
        int minPrice = prices[0];
        for(int i = 0; i < prices.length; i++){
            if(profit < prices[i] - minPrice) {
                profit = prices[i] - minPrice;
            }
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            profit1[i] = profit;
        }
        
        // reverse to find the maxprofit of subarray [i, ... , n-1]
        profit = 0;
        int maxPrice = prices[prices.length - 1];
        for(int i = prices.length - 1; i >= 0; i--){
            if(profit < maxPrice - prices[i]) {
                profit = maxPrice - prices[i];
            }
            if(prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
            profit2[i] = profit;
        }
        
        // combine two arrays to find highest profit.
        int maxP = 0;
        for(int i = 0; i < prices.length; i++){
            if(profit1[i] + profit2[i] > maxP){
                maxP = profit1[i] + profit2[i];
            }
        }
        
        return maxP;
    }
}
