class Solution {
    public int fib(int n) {
        int fib1 = 0;
        int fib2 = 1;
        int fibResult = 0;
        
        for (int i = 1; i < n; i++) {
            fibResult = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibResult;
        }
        
        return n == 1 ? 1 : fibResult;
    }
}
