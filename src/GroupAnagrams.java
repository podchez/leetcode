class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) {
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] letters = new char[26];
            for (char c : s.toCharArray()) {
                letters[c - 'a']++;
            }
            String key = new String(letters);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        result.addAll(map.values());
        return result;
    }
}
