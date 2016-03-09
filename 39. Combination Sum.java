// The original question does not ask the result to be in ascending order.
// This soultion's result is in ascending order
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        generate(candidates, res, new ArrayList<Integer>(), 0, target);
        return res;
    }
    private void generate(int[] candidates, List<List<Integer>> res, ArrayList<Integer> cur, int index, int target) {
        if (target == 0) {
// ******************************* Forget that again
            if (!res.contains(cur)) {
                res.add(new ArrayList<Integer>(cur));
                return;
            }
        }
        if (index > candidates.length - 1 || target < 0) {
            return;
        }

        int max = target / candidates[index];
        
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < i; j++) {
                cur.add(candidates[index]);
            }
            generate(candidates, res, cur, index + 1, target - candidates[index] * i);
            for (int j = 0; j < i; j++) {
                cur.remove(cur.size() - 1);
            }
        }
    }
}