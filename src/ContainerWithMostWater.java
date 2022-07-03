class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0, k = n-1;
        int h1, h2;
        boolean h1GreaterH2;
        int maxWater = 0;
        int currWater;
        
        while(i < k) {
            h1 = height[i];
            h2 = height[k];
            h1GreaterH2 = h1 > h2;
            currWater = h1GreaterH2 ? h2 * (k-i) : h1 * (k-i);
            maxWater = currWater > maxWater ? currWater : maxWater;
            
            if (h1GreaterH2) {
                k--;
            } else {
                i++;
            }
        }
        
        return maxWater;
    }
}
