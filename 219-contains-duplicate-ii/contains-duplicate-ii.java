class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
           Map<Integer, Integer> integerSet = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerSet.containsKey(nums[i]) && i - integerSet.get(nums[i]) <= k) {
                return true;
            }
            integerSet.put(nums[i], i);
        }
        return false;
    }
}