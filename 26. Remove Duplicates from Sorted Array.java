public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int i = 0, j = 0;
        while (i <= len - 1) {
            while (i < len - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
            nums[j] = nums[i];
            j++;
            i++;
        }
        return j;
    } 
}