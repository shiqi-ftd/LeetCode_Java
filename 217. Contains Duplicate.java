public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) return false;
        HashSet<Integer> res = new HashSet<Integer> ();
        for (int i = 0; i < nums.length; i++) {
            if (res.contains(nums[i])) return true;
            res.add(nums[i]);
        }
        return false;
    }
}