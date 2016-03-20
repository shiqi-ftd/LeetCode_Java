public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        int start = 0;
        int end = 0;
        int cur = 0;
        
        int min = Integer.MAX_VALUE;
        
        while (end <= nums.length) {
            if (end == nums.length && cur < s) break;
            if (cur < s) {
                cur = cur + nums[end];
                end++;
            } else {
                min = Math.min(min, end - start);
                cur = cur - nums[start];
                start++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}