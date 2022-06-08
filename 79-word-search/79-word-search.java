class Solution {
    boolean result = false;
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == word.charAt(0)){
                    dfs(board, row, col, i, j, word, 0);
                    if(result == true)
                        return true;
                }
            }
        }
        return false;
    }
    public void dfs(char[][] board, int row, int col, int i, int j, String word, int ch){
        if(i < 0 || j < 0 || i >= row || j >= col || ch >= word.length() || board[i][j] != word.charAt(ch) || board[i][j] == '*')
            return;
        
        if(ch == word.length() - 1){
            result = true;
            System.out.println(ch);    
            return;
        }
        board[i][j] = '*';
        dfs(board, row, col, i - 1, j, word, ch+1);
        dfs(board, row, col, i, j - 1, word, ch+1);
        dfs(board, row, col, i + 1, j, word, ch+1);
        dfs(board, row, col, i, j + 1, word, ch+1);
        board[i][j] = word.charAt(ch);
    }
}