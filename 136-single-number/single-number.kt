class Solution {
   fun singleNumber(nums: IntArray): Int {
    var a = 0
    for (i in nums){
        a = a xor i
    }
    return  a 
}
}