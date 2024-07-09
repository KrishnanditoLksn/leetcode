class Solution {
    public boolean containsDuplicate(int[] nums) {
          Set<Integer> ints = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            ints.add(nums[i]);
        }
        return nums.length != ints.size();
    }
}