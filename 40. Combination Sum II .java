public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        generate(candidates, res, new ArrayList<Integer>(), target, 0);
        return res;
    }
    private void generate(int[] candidates, List<List<Integer>> res, ArrayList<Integer> cur, int target, int start) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
	// Remove duplicates! Use if not while!            
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
        // Pre Check
            if (target - candidates[i] < 0) break;
            cur.add(candidates[i]);
            generate(candidates, res, cur, target - candidates[i], i + 1);
            cur.remove(cur.size() - 1);
        }
    } 
}