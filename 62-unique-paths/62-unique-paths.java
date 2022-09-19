class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] arr : dp){
            Arrays.fill(arr, 0);
        }
        /*for(int row = 1; row < m; row++){
            for(int col = 1; col < n; col++){
                dp[row][col] = dp[row-1][col] + dp[row][col-1];
            }
        }
        return dp[m-1][n-1];*/
        int[] temp = new int[n];
        temp[0] = 1;
        for(int row = 0; row < m; row++){
            for(int col = 1; col < n; col++){
                temp[col] += temp[col-1];
            }
        }
        return temp[n-1];
    }
}