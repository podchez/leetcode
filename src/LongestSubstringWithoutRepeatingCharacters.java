class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        char ch;
        int sameCharIndex;
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            
            sameCharIndex = sb.indexOf(String.valueOf(ch));
            if (sameCharIndex < 0) { // if new unique char
                sb.append(ch);
                if (sb.length() > maxLength) {
                    maxLength = sb.length();
                }
            } else {
                sb.delete(0, ++sameCharIndex);
                sb.append(ch);
            }
        }
        
        return maxLength;
    }
}
