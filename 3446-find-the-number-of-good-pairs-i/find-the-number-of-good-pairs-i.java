class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length - 1;
        int m = nums2.length;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (nums1[i] % k != 0)
                continue;
            for (int j = 0; j <= m - 1; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}