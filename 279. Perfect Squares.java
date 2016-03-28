public class Solution {
    public int numSquares(int n) {
        int[] res = new int[n + 1];
        res[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            int cur = res[i - 1] + 1;
            int j = 2;
            while (i - j * j >= 0) {
                cur = Math.min(cur, res[i - j * j] + 1);
                j++;
            }
            res[i] = cur;
        }
        return res[n];
    }
}