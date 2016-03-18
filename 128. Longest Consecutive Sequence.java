public class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.sort(nums);
        int max = 1;
        
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
        }
        
        for (int i = 1; i < len; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                dp[i] = 1 + dp[i - 1];
                max = Math.max(dp[i], max);
            } else if (nums[i] - nums[i - 1] == 0) {
                dp[i] = dp[i - 1];
            }
        }
        return max;
    }
}