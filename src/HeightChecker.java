class Solution {
    public int heightChecker(int[] heights) {
        int[] heightsSorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heightsSorted);
        int counter = 0;
        
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != heightsSorted[i]) {
                counter++;
            }
        }
        
        return counter;
    }
}
