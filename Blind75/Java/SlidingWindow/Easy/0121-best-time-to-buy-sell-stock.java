

class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, maxProf = 0;
        // l is when we buy : r is when we sell

        while(r < prices.length){
            //profit ?
            if(prices[l] < prices[r]){
                int price = prices[r] - prices[l];
                maxProf = Math.max(price, maxProf);
            }
            else{
                l = r;
            }
            r++;
        }

        return maxProf;
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// ? You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// time is O(n)
// space is O(1) 

// notes
// if r is > l ever, then we know there is some kind of profit, so calc it via get the diff or r and l, and compare it to old max profit
// otherwise set l to r and always in everycase increment r
// return calculated max profit