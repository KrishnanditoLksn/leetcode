class Solution {
    public int removeDuplicates(int[] nums) {
          int k = 0;
        for (int currentNums : nums) {
            if(k < 2 || currentNums != nums[k-2] ){
                nums[k++] = currentNums;
            }
        }
        return k;
    }
}