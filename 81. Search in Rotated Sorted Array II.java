public class Solution {
    public boolean search(int[] nums, int target) {
        if (nums == null) {
            return false;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[start]) {
                if (nums[mid] == target) {
                    return true;
                } else if (target > nums[mid] || target < nums[start]) {
                    start = mid;
                } else {
                    end = mid;
                }
            } else if (nums[mid] < nums[start]) {
                if (nums[mid] == target) {
                    return true;
                } else if (nums[mid] > target || target > nums[end]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
                start++;
            }
        }
        if (nums[start] == target) {
            return true;
        }
        if (nums[end] == target) {
            return true;
        }
        return false;
    }
}