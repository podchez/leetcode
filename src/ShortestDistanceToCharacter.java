class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        List<Integer> indexesOccurs = new ArrayList<>();
        int step = 0;
        Integer closestIndex = null;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                indexesOccurs.add(i);
            }
        }
        
        if (indexesOccurs.size() > 0) {
            for (int i = 0; i < n; i++) {
                if (closestIndex == null) {
                    closestIndex = indexesOccurs.get(step);
                } else if (step + 1 < indexesOccurs.size() &&
                        indexesOccurs.get(step + 1) - i < i - closestIndex) {
                    closestIndex = indexesOccurs.get(++step);
                }
                
                if (closestIndex < i) {
                    result[i] = i - closestIndex;
                } else if (closestIndex > i) {
                    result[i] = closestIndex - i;
                }
            }
        }
        
        return result;
    }
}
