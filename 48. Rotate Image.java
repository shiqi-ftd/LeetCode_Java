public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        // Top Down Reverse
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
        
        // Reverse along diagonal 
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                int temp = matrix[i][i + j];
                matrix[i][i + j] = matrix[i + j][i];
                matrix[i + j][i] = temp;
            }
        }
    }
}