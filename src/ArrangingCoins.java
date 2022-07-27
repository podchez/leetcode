class Solution {
    public int arrangeCoins(int n) {
        int completeRows = 0;
        
        for (int i = 1; i <= n; i++) {
            n -= i;
            completeRows++;
        }
        
        return completeRows;
    }
}
