/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1)
            return 1;
        
        int left = 1;
        int middle = n/2;
        int right = n;
        
        while (right - left >= 2) {
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle;
            }
            middle = left + (right - left) / 2;
        }
        
        if (isBadVersion(middle))
            return middle;
        else
            return middle + 1;
    }
}
