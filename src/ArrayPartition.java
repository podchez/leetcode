class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        
        for (int i = nums.length - 1; i >= 0; i -= 2) {
            maxSum += Math.min(nums[i], nums[i - 1]);
        }
        
        return maxSum;
    }
}
