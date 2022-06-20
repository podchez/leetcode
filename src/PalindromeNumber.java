class Solution {
    public boolean isPalindrome(int x) {
        char[] xCharArr = String.valueOf(x).toCharArray();
        int n = xCharArr.length;
        
        for (int i = 0; i < n/2; i++) {
            if (xCharArr[i] != xCharArr[n - 1 - i])
                return false;
        }
        
        return true;
    }
}
