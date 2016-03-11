public class Solution {
    
    int count = 0;

    public int totalNQueens(int n) {
        ArrayList<Integer> sol = new ArrayList();
        helper(sol, 0, n);
        return count;
    }
    private void helper(ArrayList<Integer> sol, int row, int end) {
        if (row == end) {
            count++;
        }
        for (int i = 0; i < end; i++) {
            if (!isValid(sol, i)) continue;
            sol.add(i);
            helper(sol, row + 1, end);
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
}