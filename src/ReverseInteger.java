class Solution {
    public int reverse(int x) {
        // Input  Example: x = 123
        // Output Example: 321
        if (x < 10 && x > -10) {
            return x;
        }
        
        int xLength;
        int limit;
        boolean isPositive = x > 0;
        
        if (isPositive) {
            limit = (int) (Math.pow(2, 31) - 1);
            xLength = String.valueOf(x).length();
        } else {
            limit = (int) -Math.pow(2, 31);
            xLength = String.valueOf(x).length() - 1;
        }
        
        long xNew = 0;
        for (int l = 1; l <= xLength; l++) {
            xNew += (x % 10) * Math.pow(10, xLength - l);
            x /= 10;
            
            if ((isPositive && xNew > limit) || 
                (!isPositive && xNew < limit)) {
                return 0;
            }
        }
        return (int) xNew;
    }
}
