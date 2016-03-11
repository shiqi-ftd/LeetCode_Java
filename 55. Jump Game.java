public class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for (int i = 1; i <= len; i++) {
            if (dp[i - 1] >= i) {
                dp[i] = Math.max(dp[i - 1], i + nums[i - 1]);
            } else {
                break;
            }
        }
        if (dp[len] != 0) return true;
            else return false;
    }
}

//Greedy
public class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (max < i) return false;
            max = Math.max(i + nums[i], max);
        }
        return true;
    }
}