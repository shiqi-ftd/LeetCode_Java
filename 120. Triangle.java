public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        int[][] dp = new int[height][height];
        int min = Integer.MAX_VALUE;
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < height; i++) {
           dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
        }
        for (int i = 1; i < height; i++) {
           dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }
        for (int i = 2; i < height; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
            }
        }
        for (int i = 0; i < height; i++) {
            min = Math.min(min, dp[height - 1][i]);
        }
        return min;
    }
}