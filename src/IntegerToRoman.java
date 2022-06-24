class Solution {
    public String intToRoman(int num) {
        String numStr = String.valueOf(num);
        int n = numStr.length();
        StringBuilder res = new StringBuilder();
        int step = 0;
        int digit;
        boolean digitGreaterThanFive;
        
        for (int i = n-1; i >= 0; i--) {
            step++;
            digit = Character.getNumericValue(numStr.charAt(i));
            if (digit > 0) {
                digitGreaterThanFive = digit > 5;
                if (digitGreaterThanFive) digit -= 5;
                
                if (digit < 4) {
                    for (int k = 0; k < digit; k++) {
                        switch (step) {
                            case 1:
                                res.append('I');
                                break;
                            case 2:
                                res.append('X');
                                break;
                            case 3:
                                res.append('C');
                                break;
                            case 4:
                                res.append('M');
                                break;
                        }
                    }
                }
                
                if (digitGreaterThanFive) digit += 5;
                
                if (digit >= 4) {
                    switch (step) {
                        case 1:
                            res.append(digit == 4 ? "VI" : // reverse IV
                                       digit == 9 ? "XI" : // reverse IX
                                       'V');
                            break;
                        case 2:
                            res.append(digit == 4 ? "LX" : // reverse XL
                                       digit == 9 ? "CX" : // reverse XC
                                       'L');
                            break;
                        case 3:
                            res.append(digit == 4 ? "DC" : // reverse CD
                                       digit == 9 ? "MC" : // reverse CM
                                       'D');
                            break;
                    }
                }
            }
        }
        
        return res.reverse().toString();
    }
}
