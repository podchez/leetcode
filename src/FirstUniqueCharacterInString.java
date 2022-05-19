class Solution {
    public int firstUniqChar(String s) {
        // character and how often it appears
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            // count = 1 if new char
            // count = count + 1  if char is already in map
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
        
        
        
        // old solution:
        
//         Map<Character, Integer> map = new LinkedHashMap<>();
//         List<Character> removedChars = new ArrayList<>();
//         int n = s.length();
//         Character currChar;
//         for (int i = 0; i < n; i++) {
//             currChar = s.charAt(i);
//             if (map.containsKey(currChar)) {
//                 map.remove(currChar);
//                 removedChars.add(currChar);
//             }
//             if (!removedChars.contains(currChar)) {
//                 map.put(currChar, i);
//             }
//         }
        
//         if (map.isEmpty()) {
//             return -1;
//         }
        
//         return map.values().stream().findFirst().get();
    }
}
