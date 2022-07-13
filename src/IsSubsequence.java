class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        
        int sIndex = 0;
        char sCurr = s.charAt(sIndex);
        
        for (int i = 0; i < t.length(); i++) {
            
            if (t.charAt(i) != sCurr) {
                continue;
            }
            
            sIndex++;
            
            if (sIndex < s.length()) {
                sCurr = s.charAt(sIndex);
            } else {
                return true;
            }
        }
        
        return false;
    }
}
