// Solved within one submit!
public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList();
        ArrayList<Integer> sol = new ArrayList();
        helper(res, sol, 0, n);
        return res;
    }
    private void helper(List<List<String>> res, ArrayList<Integer> sol, int row, int end) {
        if (row == end) {
            res.add(draw(sol));
        }
        for (int i = 0; i < end; i++) {
            if (!isValid(sol, i)) continue;
            sol.add(i);
            helper(res, sol, row + 1, end);
            sol.remove(sol.size() - 1);
        }
    }
    private boolean isValid(ArrayList<Integer> sol, int col) {
        int row = sol.size();
        for (int i = 0; i < row; i++) {
            if (sol.get(i) == col) {
                return false;
            }
            if (i - sol.get(i) == row - col) {
                return false;
            }
            if (i + sol.get(i) == row + col) {
                return false;
            }
        }
        return true;
    }
    private List<String> draw(ArrayList<Integer> sol) {
        List<String> res = new ArrayList();
        int n = sol.size();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j == sol.get(i)) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            res.add(sb.toString());
        }
        return res;
    }
}