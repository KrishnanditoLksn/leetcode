class Solution {
        public static long maximumSubarraySum(int[] nums, int k) {
        long currentSum = 0;
//        int maxSum = 0;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        //Iterate while iterator  is less than k and length of nums
//        while (i < k && i < nums.length) {
//            currentSum += nums[i];
//            if (frequencyMap.containsKey(nums[i])) {
//                frequencyMap.put(nums[i], frequencyMap.get(nums[i]) + 1);
//            } else {
//                frequencyMap.put(nums[i], 1);
//                i++;
//            }
//        }

        for (int i = 0; i < k; i++) {
            frequencyMap.merge(nums[i], 1, Integer::sum);
            currentSum += nums[i];
        }

        //if distinct element in map
        long maxSum = (frequencyMap.size() == k) ? currentSum : 0;

        //iterating from left array
        for (int i = k; i < nums.length; i++) {
//            if (frequencyMap.containsKey(nums[i])) {
//                frequencyMap.put(nums[i], frequencyMap.get(nums[i]) + 1);
//            } else {
//                frequencyMap.put(nums[i], 1);
//            }
//
//            if (frequencyMap.containsKey(nums[left])) {
//                frequencyMap.put(nums[left], frequencyMap.get(nums[left]) - 1);
//
//                if (frequencyMap.get(nums[left]) <= 0) {
//                    frequencyMap.remove(nums[left]);
//                }
//
//                currentSum += nums[j];
//                currentSum -= nums[left];
//
//                if (frequencyMap.size() == k) {
//                    maxSum = Math.max(maxSum, currentSum);
//                }
//                left++;
//            }

            frequencyMap.merge(nums[i], 1, Integer::sum);
            //remove the left most  element from the window

            int leftElement = nums[i - k];
            if (frequencyMap.merge(leftElement, -1, Integer::sum) == 0) {
                frequencyMap.remove(leftElement);
            }
            //update the current sum
            currentSum = currentSum + nums[i] - nums[i - k];
            //if element is distinct , update max sum
            if (frequencyMap.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }

        }
        return maxSum;
    }
}