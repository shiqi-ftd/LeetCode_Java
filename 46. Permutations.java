public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        if (nums == null) return res;
        generate(res, cur, nums);
        return res;
    }
    private void generate(List<List<Integer>> res, ArrayList<Integer> cur, int[] nums) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (cur.contains(nums[i])) {
                continue;
            }
            cur.add(nums[i]);
            generate(res, cur, nums);
            cur.remove(cur.size() - 1);
        }
    }
}