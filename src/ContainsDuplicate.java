class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setOfNums = new HashSet<>();
        for (int i : nums) {
            if (!setOfNums.add(i)) {
                return true; // if we can't add value to set => value appears at least twice
            }
        }
        return false;
    }
}
