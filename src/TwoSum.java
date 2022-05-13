class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Input  Example: nums = [2,7,11,15], target = 9
        // Output Example: [0,1]
        
        Map<Integer, Integer> map = new HashMap<>();
        int diff;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i], i);
        }
        
        throw new RuntimeException("There is no solution");
    }
}
