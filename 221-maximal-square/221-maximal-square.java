class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[][] dp = new int[row+1][col+1];
        int max_len = 0;
        
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1])+1;
                    max_len = Math.max(max_len, dp[i][j]);
                }
            }
        }
        
        return max_len * max_len;
    }
}