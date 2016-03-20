public class Solution {
    public int rob(int[] nums) {    
        if (nums.length == 1) return nums[0];
            return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }
    private int rob(int[] nums, int lo, int hi) {
        int len = hi - lo + 1;
        int[] dp = new int[len + 1];
        if (len < 1) return 0;
        dp[1] = nums[lo];
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i + lo - 1]);
        }
        return dp[len];
    }
}