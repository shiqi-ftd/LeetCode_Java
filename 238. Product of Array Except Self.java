public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int cur = 1;
        int[] left = new int[len];
        left[0] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        for (int i = len - 1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = left[i] * cur;
            cur = cur * temp;
        }
        return nums;
    }
}