public class Solution {
    
    private int m;
    private int n;
    
    private static final int[] dx = new int[]{1, -1, 0, 0};
    private static final int[] dy = new int[]{0, 0, 1, -1};
    
    private void removeIsland(char[][] grid, int x, int y) {
        grid[x][y] = '0';
        for (int i = 0; i < 4; i++) {
            int nextM = x + dx[i];
            int nextN = y + dy[i];
            if (nextM >= 0 && nextM < m && nextN >= 0 && nextN < n) {
                if (grid[nextM][nextN] == '1') removeIsland(grid, nextM, nextN);
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        m = grid.length;
        if (m == 0) return 0;
        n = grid[0].length;
        if (n == 0) return 0;
        
        int counter = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    removeIsland(grid, i, j);
                    counter++;
                }
            }
        }
        return counter;
    }
}