class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        
        return Arrays.equals(sCharArray, tCharArray);
        
        // old solution (lists and streams instead of arrays)
//         if (t.length() != s.length())
//             return false;
        
//         List<Integer> sIntListSorted = s.chars().sorted().boxed().collect(Collectors.toList());
//         List<Integer> tIntListSorted = t.chars().sorted().boxed().collect(Collectors.toList());
        
//         return sIntListSorted.equals(tIntListSorted);
    }
}
