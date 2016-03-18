public class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int[] max = new int[len];
        int[] min = new int[len];
        
        int result = nums[0];
        max[0] = min[0] = nums[0];
        
        for (int i = 1; i < len; i++) {
            max[i] = nums[i];
            min[i] = nums[i];
            if (nums[i] > 0) {
                max[i] = Math.max(max[i - 1] * nums[i], nums[i]);
                min[i] = Math.min(min[i - 1] * nums[i], nums[i]);
            }
            if (nums[i] < 0) {
                max[i] = Math.max(min[i - 1] * nums[i], nums[i]);
                min[i] = Math.min(max[i - 1] * nums[i], nums[i]);
            }
            result = Math.max(result, max[i]);
        }
        
        return result;
    }
}