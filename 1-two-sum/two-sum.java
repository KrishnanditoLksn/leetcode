class Solution {
   public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //store the complement of the current number
            int complement = target - nums[i];
            //check if the complement is in the hashmap
            if (hashMap.containsKey(complement)) {
                //return array of a result if found
                return new int[]{hashMap.get(complement), i};
            }
            //put the current number and its index in the hashmap
            hashMap.put(nums[i], i);
        }
        return null;
    }
}