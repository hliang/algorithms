/*
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 *
 */

/*
 * 在每次上升子序列之前买入，在上升子序列结束的时候卖出。相当于能够获得所有的上升子序列的收益。
 * 而且，对于一个上升子序列，比如：5，1，2，3，4，0 中的1，2，3，4序列来说，对于两种操作方案：
 * 一，在1买入，4卖出；
 * 二，在1买入，2卖出同时买入，3卖出同时买入，4卖出；
 * 这两种操作下，收益是一样的。
 * 所以算法就是：从头到尾扫描prices，如果i比i-1大，那么price[i] – price[i-1]就可以计入最后的收益中。这样扫描一次O(n)就可以获得最大收益了。
 */

public class Solution {
    
    public int maxProfit_1(int[] prices) {
        int totalProfit = 0;
        if(prices.length > 0) {
            int buy = prices[0];
            for(int i : prices){
                if(i > buy){
                    totalProfit += i - buy;
                }
                buy = i;
            }
        }
        return totalProfit;
    }
    

    // same as above, but more intuitive
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        if(prices.length > 0) {
            for(int i = 1; i < prices.length; i++){
                if(prices[i] - prices[i-1] > 0){
                    totalProfit += prices[i] - prices[i-1];
                }
            }
        }
        return totalProfit;
    }
}
