class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int nineCountFromEnd = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                nineCountFromEnd++;
                continue;
            }
            break;
        }
        
        int[] digitsPlusOne;
        if (nineCountFromEnd == n) {
            digitsPlusOne = new int[n + 1];
            Arrays.fill(digitsPlusOne, 0);
            digitsPlusOne[0] = 1;
        } else if (nineCountFromEnd == 0) {
            digitsPlusOne = Arrays.copyOf(digits, n);
            digitsPlusOne[n - 1] += 1;
        } else {
            digitsPlusOne = Arrays.copyOf(digits, n);
            for (int i = n - 1; i >=0; i--) {
                digitsPlusOne[i] = 0;
                if (--nineCountFromEnd == 0) {
                    digitsPlusOne[i - 1] += 1;
                    break;
                }
            }
        }
        return digitsPlusOne;
    }
}
