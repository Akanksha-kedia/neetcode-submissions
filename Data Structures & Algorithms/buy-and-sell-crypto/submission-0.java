
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            // Track the lowest price to buy at
            if (price < minPrice) {
                minPrice = price;
            }

            // Calculate profit if we sell today
            int profit = price - minPrice;

            // Keep the maximum profit found so far
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}

