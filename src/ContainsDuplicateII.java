class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> numIndex = new HashMap<>(n);
        int num;
        
        for (int i = 0; i < n; i++) {
            num = nums[i];
            if (numIndex.containsKey(num) && i - numIndex.get(num) <= k) {
                return true;
            }
            numIndex.put(num, i);
        }
        
        return false;
    }
}
