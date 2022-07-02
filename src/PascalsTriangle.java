class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> currentRow = null, previousRow = null;
        
        if (numRows > 0) {
            previousRow = List.of(1);
            triangle.add(previousRow);
        }
        
        for (int i = 1; i < numRows; i++) {
            currentRow = new ArrayList<>();
            currentRow.add(1);
            
            for (int k = 0; k < previousRow.size() - 1; k++) {
                currentRow.add(previousRow.get(k) + previousRow.get(k+1));
            }
            
            currentRow.add(1);
            triangle.add(currentRow);
            previousRow = currentRow;
        }
        
        return triangle;
    }
}
