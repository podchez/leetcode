class Solution {
    public String reverseStr(String s, int k) {
        int sLen = s.length();
        StringBuilder sb = new StringBuilder(sLen);
        boolean shouldReverse = true;
        
        for (int i = 0; i < sLen; i += k) {
            if (shouldReverse) {
                sb.append(new StringBuilder(
                    s.substring(i, i + k < sLen ? i + k : sLen)).reverse());
                shouldReverse = false;
            } else {
                sb.append(s.substring(i, i + k < sLen ? i + k : sLen));
                shouldReverse = true;
            }
        }
        
        return sb.toString();
    }
}
