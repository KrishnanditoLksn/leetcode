class Solution {
    fun maximumCount(nums: IntArray): Int {
    var pos = 0
    var neg = 0
    for(counter in nums.indices){
        if (nums[counter] > 0){
            pos++

        }
        if(nums[counter] < 0){
            neg++

        }
    }
    return max(pos , neg)
}
}