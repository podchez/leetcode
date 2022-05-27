class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortestStr = Arrays.stream(strs)
            .min((s1, s2) -> s1.compareTo(s2))
            .get();

        for (int i = 0; i < shortestStr.length(); i++) {
            char currChar = shortestStr.charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != currChar)
                    return shortestStr.substring(0, i);
            }
        }
        return shortestStr;
    }
}
