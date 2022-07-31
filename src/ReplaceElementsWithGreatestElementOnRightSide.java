class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int greatest = arr[n - 1];
        int current;
        arr[n - 1] = -1;
        
        for (int i = n - 2; i >= 0; i--) {
            current = arr[i];
            arr[i] = greatest;
            greatest = current > greatest ? current : greatest;
        }
        
        return arr;
    }
}
