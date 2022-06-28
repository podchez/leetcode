class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder(s.length());
        boolean firstIter = true;
        
        for (String word : s.split(" ")) {
            if (!firstIter) {
                result.append(" ");
            }
            result.append(new StringBuilder(word).reverse());
            firstIter = false;
        }
        
        return result.toString();
    }
}
