class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        for (int i =0; i< prices.length;i++) {
            int num = prices[i];
            for (int j =i+1; j<prices.length;j++) {
              max = Math.max(max, prices[j]-num);
            }
        }
        return max;
    }
}
