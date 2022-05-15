class Solution {
    public void moveZeroes(int[] nums) {
        // Input  Example: nums = [0,1,0,3,12]
        // Output Example: [1,3,12,0,0]
        
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
