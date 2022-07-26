class Solution { 
    // binary search solution
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        int left = 1;
        int right = x;
        int middle; // the square root of x
        
        while (true) {
            middle = left + (right - left)/2;
            if (middle > x/middle) {
                right = middle - 1;
            } else if (middle < x/middle) {
                left = middle + 1;
                if (left > x/left) { // left * left > x
                    return middle;
                }
            } else { // middle * middle == x
                return middle;
            }
        }
    }
}
