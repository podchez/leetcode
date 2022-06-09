class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char currChar;
        char nextChar;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            currChar = s.charAt(i);
            switch (currChar) {
                case 'I':
                    nextChar = (i + 1) != n ? s.charAt(i + 1) : '-';
                    if (nextChar == 'V') {
                        result += 4;
                        i++;
                        break;
                    } else if (nextChar == 'X') {
                        result += 9;
                        i++;
                        break;
                    }
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    nextChar = (i + 1) != n ? s.charAt(i + 1) : '-';
                    if (nextChar == 'L') {
                        result += 40;
                        i++;
                        break;
                    } else if (nextChar == 'C') {
                        result += 90;
                        i++;
                        break;
                    }
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    nextChar = (i + 1) != n ? s.charAt(i + 1) : '-';
                    if (nextChar == 'D') {
                        result += 400;
                        i++;
                        break;
                    } else if (nextChar == 'M') {
                        result += 900;
                        i++;
                        break;
                    }
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }
}
