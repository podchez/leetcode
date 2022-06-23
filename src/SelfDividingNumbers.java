class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        
        for (int num = left; num <= right; num++) {
            if (isSelfDividingNum(num)) {
                result.add(num);
            }
        }
        
        return result;
    }
    
    private boolean isSelfDividingNum(int num) {
        char[] numChars = String.valueOf(num).toCharArray();
        
        for (int i = 0; i < numChars.length; i++) {
            if (numChars[i] == '0' || 
                num % Character.getNumericValue(numChars[i]) != 0) {
                return false;
            }
        }
        
        return true;
    }
}
