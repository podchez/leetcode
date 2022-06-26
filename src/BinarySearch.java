class Solution {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int middleIndex;
        
        if (endIndex == startIndex)
            return target == nums[0] ? 0 : -1;
        
        while (endIndex >= startIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (target > nums[middleIndex]) {
                startIndex = middleIndex + 1;
            } else if (target < nums[middleIndex]) {
                endIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        
        return -1;
    }
}
