class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiopQWERTYUIOP";
        String secondRow = "asdfghjklASDFGHJKL";
        String thirdRow = "zxcvbnmZXCVBNM"; 
        String currentRow;
        List<String> result = new ArrayList<>();
        boolean shouldAddToResult;
        
        for (String word : words) {
            shouldAddToResult = true;
            
            currentRow = firstRow.indexOf(word.charAt(0)) != -1 ? firstRow :
                        secondRow.indexOf(word.charAt(0)) != -1 ? secondRow :
                        thirdRow.indexOf(word.charAt(0)) != -1 ? thirdRow : null;
            
            if (currentRow == null) {
                continue;
            }
            
            for (int i = 1; i < word.length(); i++) {
                if (currentRow.indexOf(word.charAt(i)) == -1) {
                    shouldAddToResult = false;
                    break;
                }
            }
            
            if (shouldAddToResult) {
                result.add(word);
            }
        }
        
        return result.toArray(String[]::new);
    }
}
