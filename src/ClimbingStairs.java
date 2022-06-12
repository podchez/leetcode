class Solution {
    public int climbStairs(int n) {
        int num1 = 0;
        int num2 = 1;
        int nextNum = 0;
        
        // climbStairs(n) == fib(n + 1)
        for (int i = 2; i <= n + 1; i++) {
            nextNum = num1 + num2;
            if (i % 2 == 0)
                num1 = nextNum;
            else
                num2 = nextNum;
        }
        
        return nextNum; // == distinct ways
    }
}
