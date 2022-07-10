class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
       
        int beforeProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = beforeProduct;
            beforeProduct *= nums[i];
        }
        
        int afterProduct = 1;
        for (int i = n-1; i >= 0; i--) {
            result[i] *= afterProduct;
            afterProduct *= nums[i];
        }
        
        return result;
    }
}
