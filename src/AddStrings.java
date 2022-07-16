class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int n1 = num1.length();
        int n2 = num2.length();
        int n = n1 > n2 ? n1 : n2;
        
        boolean extraOneExists = false;
        char ch1, ch2;
        int chSum;
        
        for (int i = 0; i < n; i++) {
            ch1 = i < n1 ? num1.charAt(n1-1-i) : '0';
            ch2 = i < n2 ? num2.charAt(n2-1-i) : '0';
            chSum = Character.getNumericValue(ch1) + Character.getNumericValue(ch2);
            if (extraOneExists) {
                chSum++;
                extraOneExists = false;
            }
            
            if (chSum < 10) {
                sb.append(Character.forDigit(chSum, 10));
            } else {
                extraOneExists = true;
                sb.append(Character.forDigit(chSum - 10, 10));
            }
        }
        
        if (extraOneExists) {
            sb.append(1);
        }
        
        return sb.reverse().toString();
    }
}
