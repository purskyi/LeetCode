fun main() {

    Solution().run { runningSum(intArrayOf(5,5,5,5,100)) }
        .also { for (i in 0 until it.size )
                { println(it[i])} }
}

class Solution {
    fun runningSum(nums: IntArray): IntArray {

        var outputArray = nums.copyOf()
        for (i in 0 until  nums.size)
        {
            for (j in 0 until  i) {
                outputArray[i] += nums[j]
            }
        }

        return outputArray
    }
}