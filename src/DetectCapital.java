class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) {
            return true;
        }
        
        boolean isFirstCapital = word.charAt(0) >= 65 && word.charAt(0) <= 90;
        boolean isSecondCapital = word.charAt(1) >= 65 && word.charAt(1) <= 90;
        if (!isFirstCapital && isSecondCapital) { // "aA"
            return false;
        }
        
        if (isFirstCapital && isSecondCapital) { // "AA"
            for (char ch : word.substring(2).toCharArray()) {
                if (ch < 65 || ch > 90) {
                    return false;
                }
            }
        } else { // "Aa" or "aa"
            for (char ch : word.substring(2).toCharArray()) {
                if (ch >= 65 && ch <= 90) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
