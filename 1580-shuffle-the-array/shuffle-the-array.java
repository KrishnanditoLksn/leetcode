class Solution {
    public static  int[] shuffle(int[] nums, int n) {
        int [] result = new int[nums.length];
        int j = 0;
        int l = n;
        for (int i = 0; i < n; i++) {
            result[j] = nums[i];
            result[j+1] = nums[l];
            j+=2;
            l++;
        }
        return result;
    }
}