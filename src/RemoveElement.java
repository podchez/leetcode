class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0; // number of val in nums
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == val && i < n-k) {
                k++;
                nums[i] = nums[n-k];
                i--;
            }
        }
        
        return n - k;
    }
}
