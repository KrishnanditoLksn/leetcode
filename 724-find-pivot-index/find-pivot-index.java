class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;

        //fill a total sum of all elements
        for (int num : nums) {
            totalSum += num;
        }
        //loop through elements
        for (int i = 0; i < nums.length; i++) {
            //check if all sum equals to a left sum  if not
            if (totalSum - leftsum - nums[i] == leftsum) {
                return i;
            }
            //fill a left sum with nums element
            leftsum += nums[i];
        }
        return -1;
    }
}