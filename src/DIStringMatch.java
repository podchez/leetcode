class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] result = new int[n + 1];
        int min = 0, max = n;
        
        for (int i = 0; i < n; i++) {
            result[i] = s.charAt(i) == 'I' ? min++ : max--;
        }
        result[n] = min;
        
        return result;
    }
}
