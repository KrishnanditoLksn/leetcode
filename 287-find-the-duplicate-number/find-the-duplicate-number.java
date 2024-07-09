class Solution {
     public int findDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}