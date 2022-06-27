class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> numCount = new HashMap<>();
        int count;
        
        for (int num : nums) {
            count = numCount.getOrDefault(num, 0) + 1;
            if (count > n/2) return num;
            numCount.put(num, count);
        }
        
        throw new RuntimeException("There is no solution");
    }
}
