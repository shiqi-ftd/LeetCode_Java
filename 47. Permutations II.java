public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        if (nums == null) return res;
        Arrays.sort(nums);
        generate(res, cur, nums, used);
        return res;
    }
    private void generate(List<List<Integer>> res, ArrayList<Integer> cur, int[] nums, boolean[] used) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]) continue;
            if( i > 0 && nums[i-1]==nums[i] && !used[i-1]) continue;
            used[i] = true;
            cur.add(nums[i]);
            generate(res, cur, nums, used);
            used[i] = false;
            cur.remove(cur.size() - 1);
        }
    }
}