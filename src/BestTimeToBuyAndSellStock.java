class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = Integer.MAX_VALUE; // when buying
        for (int price : prices) {
            if (price < lowestPrice) {
                lowestPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - lowestPrice);
            }
        }
        return maxProfit;
    }
}
