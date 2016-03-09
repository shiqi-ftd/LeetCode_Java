public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] >= target) {
                return i;
            }
            if (i == len - 1) {
                return len;
            }
        }
        return 0;
    }
}


public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target){
                end = mid;
            } else {
                start = mid;
            }
        }
        if (nums[start] >= target) {
            return start;
        } else if (nums[end] >= target) {
            return end;
        } else {
            return end + 1;
        }
    }
}