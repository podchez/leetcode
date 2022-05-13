class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Input  Example: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        // Output Example: [4,9]
        
        List<Integer> listNums1 = Arrays.stream(nums1)
            .boxed()
            .collect(Collectors.toList());
        
        List<Integer> listNums2 = Arrays.stream(nums2)
            .boxed()
            .collect(Collectors.toList());
        
        Set<Integer> setNums1 = new HashSet<>(listNums1);
        
        List<Integer> outputList = new ArrayList<>();
        
        int frequency1, frequency2, frequency;
        for (int num : setNums1) {
            frequency1 = Collections.frequency(listNums1, num);
            frequency2 = Collections.frequency(listNums2, num);
            frequency = Math.min(frequency1, frequency2);
            for (int i = 0; i < frequency; i++) {
                outputList.add(num);
            }
        }
        
        int size = outputList.size();
        int[] outputArray = new int[size];
        for (int i = 0; i < size; i++) {
            outputArray[i] = outputList.get(i);
        }
        return outputArray;
    }
}
