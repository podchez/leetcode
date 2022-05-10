class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1; // first number will be always included in result (nums[0])
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1]) {
                continue; // bypassing its duplicates
            }
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}
