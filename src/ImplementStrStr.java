class Solution {
    public int strStr(String haystack, String needle) {
        // Input  Example: haystack = "hello", needle = "ll"
        // Output Example: 2
        
        if (needle.isEmpty()) {
            return 0;
        }
        
        int nl = needle.length();
        int hl = haystack.length();
        
        if (nl > hl) {
            return -1;
        }
        
        char needleCharAtZeroIndex = needle.charAt(0);
        for (int i = 0; i < hl; i++) {
            if (haystack.charAt(i) == needleCharAtZeroIndex) {
                if (nl == 1) {
                    return i;
                } else if (i + nl <= hl) {
                    for (int j = 1; j < nl; j++) {
                        if (haystack.charAt(i + j) != needle.charAt(j)) {
                            break;
                        }
                        if (j == nl - 1) {
                            return i;
                        }
                    }
                }
            }
        }
        
        return -1;
    }
}
