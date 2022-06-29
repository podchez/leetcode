class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 
                                       'A', 'E', 'I', 'O', 'U');
        List<Integer> vowelIndexes = new ArrayList<>();
        Character currChar;
        
        for (int i = 0; i < s.length(); i++) {
            currChar = s.charAt(i);
            if (vowels.contains(currChar))
                vowelIndexes.add(i);
        }
        
        int n = vowelIndexes.size();
        StringBuilder sb = new StringBuilder(s);
        Character currVowel, reverseVowel;
        int currIndex, reverseIndex;
        
        for (int i = 0; i < n/2; i++) {
            currIndex = vowelIndexes.get(i);
            reverseIndex = vowelIndexes.get(n-1-i);
            currVowel = sb.charAt(currIndex);
            reverseVowel = sb.charAt(reverseIndex);
            sb.setCharAt(currIndex, reverseVowel);
            sb.setCharAt(reverseIndex, currVowel);
        }
        
        return sb.toString();
    }
}
