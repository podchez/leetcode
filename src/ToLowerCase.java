class Solution {
    public String toLowerCase(String s) {
        char[] result = s.toCharArray();
        
        for (int i = 0 ; i < result.length; i++) {
            if (result[i] >= 'A' && result[i] <= 'Z') {
                result[i] += 32;
            }
        }
        
        return new String(result);
    }
}
