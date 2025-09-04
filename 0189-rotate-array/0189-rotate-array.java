class Solution {
    private int[] nums;

    public void rotate(int[] nums, int k) {
        this.nums = nums;
        int n = nums.length;
        k = k % n;
        reverseArray(0, n - 1);
        reverseArray(0, k-1);
        reverseArray(k , n-1);
    }

    public void reverseArray(int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}