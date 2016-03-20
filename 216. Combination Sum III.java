public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res =  new ArrayList();
        ArrayList<Integer> sub = new ArrayList<Integer> ();
        helper(res, sub, 1, n, k);
        return res;
    }
    private void helper(List<List<Integer>> res, ArrayList<Integer> sub, int idx, int cur, int size) {
        if (cur < 0 || sub.size() > size) {
            return;
        }
        if (cur == 0 && sub.size() == size) {
            res.add(new ArrayList(sub));
            return;
        } else if (sub.size() == size) {
            return;
        }
        
        for (int i = idx; i <= 9; i++) {
            if (cur - i < 0) break;
            sub.add(i);
            helper(res, sub, i + 1, cur - i, size);
            sub.remove(sub.size() - 1);
        }
    }
}