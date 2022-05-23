class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length())
            return false;
        
        List<Integer> sIntListSorted = s.chars().sorted().boxed().collect(Collectors.toList());
        List<Integer> tIntListSorted = t.chars().sorted().boxed().collect(Collectors.toList());
        
        return sIntListSorted.equals(tIntListSorted);
    }
}
