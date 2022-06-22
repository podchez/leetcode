class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        int lastWordLen = 0;
        
        for (int i = n - 1; i >= 0 && s.charAt(i) != ' '; i--) {
            lastWordLen++;
        }
        
        return lastWordLen;
    }
}
