public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(nums, res, new ArrayList<Integer>(), 0);
        return res;
    }
    private void helper(int[] nums, List<List<Integer>> res, ArrayList<Integer> cur, int start) {
        
        res.add(new ArrayList<Integer>(cur));
        
        for (int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            helper(nums, res, cur, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
