class Solution {
    // if the sum of all digits of that number is divisible by 3
    private boolean isDivisibleByThree(int n) {
        char[] nChars = Integer.toString(n).toCharArray();
        int digitSum = 0;
        for (char c : nChars)
            digitSum += (int) c;

        return digitSum % 3 == 0;
    }
    
    public boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        else if (n < 3)
            return false;
        
        while (isDivisibleByThree(n)) {
            n /= 3;
        }
        return n == 1;
    }
}
