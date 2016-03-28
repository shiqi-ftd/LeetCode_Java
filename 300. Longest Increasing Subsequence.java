public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[] res = new int[nums.length + 1];
        int max = 1;
        
        for (int i = 0; i <= nums.length; i++) {
            res[i] = 1;
        }
        
        for (int i = 2; i <= nums.length; i++) {
            int cur = 1;
            for (int j = 1; j < i; j++) {
                if (nums[j - 1] < nums[i - 1]) {
                    cur = Math.max(1 + res[j], cur);
                }
            }
            res[i] = cur;
            max = Math.max(max, cur);
        }
        return max;
    }
}