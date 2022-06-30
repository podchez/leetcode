class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int len = aLen >= bLen ? aLen : bLen;
        StringBuilder result = new StringBuilder(len);
        char aChar, bChar, resChar;
        boolean remainderExists = false;
        
        for (int i = 0; i < len; i++) {
            resChar = '0';
            
            if (i < aLen) {
                aChar = a.charAt(aLen-1-i);
                if(remainderExists) {
                    if (aChar == '0') {
                        resChar = '1';
                        remainderExists = false;
                    } else {
                        resChar = '0'; // new remainder exists
                    }
                } else {
                    resChar = aChar;
                }
            }
            
            if (i < bLen) {
                bChar = b.charAt(bLen-1-i);
                if(remainderExists && i >= aLen) {
                    if (bChar == '0') {
                        resChar = '1';
                        remainderExists = false;
                    } else {
                        resChar = '0'; // new remainder exists
                    }
                } else {
                    if (resChar == '0') {
                        resChar = bChar;
                    } else {
                        if (bChar == '1') {
                            resChar = '0';
                            remainderExists = true;
                        }
                    }
                }
            }
            
            result.append(resChar);
        }
        
        if (remainderExists) {
            result.append('1');
        }
        
        return result.reverse().toString();
    }
}
