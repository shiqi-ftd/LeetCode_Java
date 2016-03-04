public class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int min = Integer.MAX_VALUE;
    int cloestSum = 0;
    for (int i = 0; i < nums.length-2; i++) {
        if (i == 0 || nums[i] != nums[i - 1]) {
            int lo = i+1, hi = nums.length-1;
            while (lo < hi) {
                if (nums[lo] + nums[hi] + nums[i] == target) {
                    return target;
                }
                if (Math.abs(nums[lo] + nums[hi] + nums[i] - target) < min) {
                    min = Math.abs(nums[lo] + nums[hi] + nums[i] - target);
                    cloestSum = nums[lo] + nums[hi] + nums[i];
                } 
                if (nums[lo] + nums[hi] + nums[i] - target < 0) {
                    while (lo < hi && nums[lo] == nums[lo + 1]) {
                        lo++;
                    }
                    lo++;
                } else {
                    while (lo < hi && nums[hi] == nums[hi - 1]) {
                        hi--;
                    }
                    hi--;                    
                } 
           }
        }
    }
    return cloestSum;
    }
}