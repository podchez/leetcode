class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        Set<Character> rowSet = new HashSet<>();
        
        List<Set<Character>> columnSets = new ArrayList<>();
        for (int i = 0; i < n; i++)
            columnSets.add(new HashSet<>());
        
        List<Set<Character>> subBoxes = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            subBoxes.add(new HashSet<>());
        
        char curr;
        
        for (int i = 0; i < n; i++) {
            rowSet.clear();
            if (i % 3 == 0) {
                subBoxes.get(0).clear();
                subBoxes.get(1).clear();
                subBoxes.get(2).clear();
            }
            
            for (int j = 0; j < n; j++) {
                
                curr = board[i][j];
                if (curr == '.')
                    continue;
                else if (curr < '1' || curr > '9')
                    return false;
                    
                // check in row
                if (!rowSet.add(curr))
                    return false;
                
                // check in columns
                if (!columnSets.get(j).add(curr))
                    return false;
                
                // check in 3x3 sub-boxes
                if (!subBoxes.get(j/3).add(curr))
                    return false;
            }
        }
        return true;
    }
}
