class Solution {
    public void rotate(int[] nums, int k) {
        
        // Input  Example:   nums = [1,2,3,4,5,6,7], k = 3
        // Output Example:   [5,6,7,1,2,3,4]
        
        if (k == 0) {
            return;
        }
        
        int n = nums.length;
        k = k % n; // for cases when k > n
        
        int[] outputArray = new int[n];
        
        // new first part
        for (int i = 0; i < k; i++) {
            outputArray[i] = nums[n-k+i];
        }
        
        // new second part
        for (int i = k; i < n; i++) {
            outputArray[i] = nums[i-k];
        }
        
        System.arraycopy(outputArray, 0, nums, 0, n);
    }
}
