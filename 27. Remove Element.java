public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int len = nums.length;
        int j = 0;
        for (int i = 0; i < len; i++) {
            while (i <= len - 1 && nums[i] == val) {
                i++;
            }
            if (i == len) {
                return j;
            }
            nums[j] = nums[i];
            j++;
        }
        return j;
    }
}