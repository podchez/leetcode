class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        int num, secondPart;
        
        for (int i = 0; i < numbers.length; i++) {
            num = numbers[i];
            secondPart = target - num;
            if (numToIndex.containsKey(secondPart)) {
                return new int[]{numToIndex.get(secondPart) + 1, i + 1};
            }
            numToIndex.put(num, i);
        }
        
        throw new RuntimeException("There is no solution");
    }
}
