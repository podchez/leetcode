class Solution {
    public boolean isPalindrome(String s) {    
        char[] sChars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int sLen = sChars.length;
        
        for (int i = 0; i < sLen/2; i++) {
            if (sChars[i] != sChars[sLen - 1 - i])
                return false;
        }        
        
        return true;
        
        // old solution:
      
//         String sClear = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//         return sClear.equals(new StringBuilder(sClear).reverse().toString());
    }
}
