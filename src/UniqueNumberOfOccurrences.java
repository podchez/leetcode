class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> numToOccurrences = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            numToOccurrences.put(arr[i], numToOccurrences.getOrDefault(arr[i], 0) + 1);
        }
        
        int uniqueNums = numToOccurrences.size();
      
        return numToOccurrences.values().stream()
            .distinct()
            .collect(Collectors.toList()).size() == uniqueNums;
    }
}
