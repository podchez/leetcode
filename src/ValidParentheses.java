class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Map<Integer, Character> numBracket = new HashMap<>(n/2);
        char curr;
        int countNotClosed = 0;
        
        for (int i = 0; i < n; i++) {
            curr = s.charAt(i);
            if (curr == '(')
                numBracket.put(++countNotClosed, ')');
            else if (curr == '{')
                numBracket.put(++countNotClosed, '}');
            else if (curr == '[')
                numBracket.put(++countNotClosed, ']');
            else if (countNotClosed > 0 && curr == numBracket.get(countNotClosed))
                    countNotClosed--;
            else
                return false;
        }
        
        if (countNotClosed == 0)
            return true;
        else
            return false;
    }
}
