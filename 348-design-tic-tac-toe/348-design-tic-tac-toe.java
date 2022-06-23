class TicTacToe {
    int[] rows;
    int[] cols;
    int diagonal;
    int antidiagonal;
    int n;
    public TicTacToe(int n) {
        this.n = n;
        rows = new int[n];
        cols = new int[n];
    }
    
    public int move(int row, int col, int player) {
        int current_player = player == 1 ? 1 : -1;
        rows[row] += current_player;
        cols[col] += current_player;
        if(row == col)
            diagonal += current_player;
        if(col == cols.length - row - 1)
            antidiagonal += current_player;
        //int n = rows.length;
        if(Math.abs(rows[row]) == n || Math.abs(cols[col]) == n || Math.abs(diagonal) == n || Math.abs(antidiagonal) == n)
            return player;
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */