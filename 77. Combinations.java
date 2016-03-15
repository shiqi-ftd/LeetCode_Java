public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(nums, res, new ArrayList<Integer>(), 0, k);
        return res;
    }
    private void helper(int[] nums, List<List<Integer>> res, ArrayList<Integer> cur, int start, int len) {
        if (cur.size() == len) {
            res.add(new ArrayList<Integer>(cur));
            return;
        }
	// To avoid insufficient nums
        for (int i = start; i < nums.length - (len - cur.size()) + 1; i++) {
            cur.add(nums[i]);
            helper(nums, res, cur, i + 1, len);
            cur.remove(cur.size() - 1);
        }
    }
}