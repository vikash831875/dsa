class Solution {

    public static int path(int row, int column, int m, int n, int dp[][]) {

        if(row >= m || column >= n) return 0;

        if(row == m-1 || column == n-1) return 1;

        if(dp[row][column] != -1) return dp[row][column];

        int right = path(row, column+1, m, n, dp);
        int down = path(row+1, column, m, n, dp);

        int ans = right + down;
        dp[row][column] = ans;

        return ans;
    }

    public int uniquePaths(int m, int n) {

        int dp[][] = new int[m][n];

        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return path(0, 0, m, n, dp);
    }
}