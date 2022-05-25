class Solution {
    boolean boundary = false;
    public int closedIsland(int[][] grid) {        
        if(grid == null || grid.length == 0)
            return 0;
        int count = 0;
        for(int i = 1; i < grid.length-1; i++){
            for(int j = 1; j < grid[0].length-1; j++){
                if(grid[i][j] == 0){
                    dfs(grid, i, j);
                    if(boundary == false)
                        count++;
                    boundary = false;
                }
            }
        }
        return count;
    }
    public void dfs(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i > grid.length-1 || j > grid[0].length-1 || grid[i][j] != 0)
            return;
        if(i == 0 || j == 0 || i == grid.length-1 || j == grid[0].length-1)
            boundary = true;
        grid[i][j] = 1;
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}