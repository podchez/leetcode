class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> numToCount = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        
        return numToCount.entrySet().stream()
            .sorted((e1, e2) -> e2.getValue().intValue() - e1.getValue().intValue())
            .limit(k)
            .mapToInt(e -> e.getKey())
            .toArray();
    }
}
