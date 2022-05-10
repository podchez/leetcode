class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        
        if (n == 1) {
            return nums[0];
        }
        
        Set<Integer> set = new HashSet<>(n/2 + 1);
        
        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        
        return set.stream()
            .findFirst().get();
    }
}
