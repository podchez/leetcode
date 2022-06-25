class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        
        char[] numChars = String.valueOf(num).toCharArray();
        int newNum = 0;
        for (int i = 0; i < numChars.length; i++) {
            newNum += Character.getNumericValue(numChars[i]);
        }
        return addDigits(newNum);
    }
}
