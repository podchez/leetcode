class Solution {
    public boolean isHappy(int n) {
        char[] numAsChars;
        int step = 0;
        
        while (n != 1) {
            numAsChars = String.valueOf(n).toCharArray();
            n = 0;
            for (int i = 0; i < numAsChars.length; i++) {
                n += Math.pow(Character.getNumericValue(numAsChars[i]), 2);
            }
            
            if (++step > 6) {
                return false;
            }
        }
        
        return true;
    }
}
