class Solution {
    boolean possible = true;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count = 0;
        for(int i = 0; i < grid1.length; i++){
            for(int j = 0; j < grid1[0].length; j++){
                if(grid2[i][j] == 1){
                    dfs(grid1, grid2, i, j);
                    if(possible == true)
                        count++;
                    possible = true;
                }
            }
        }
        return count;
    }
    public void dfs(int[][] grid1, int[][] grid2, int i, int j){
        if(i < 0 || j < 0 || i > grid2.length-1 || j > grid2[0].length-1 || grid2[i][j] != 1)
            return;
        if(grid1[i][j] != grid2[i][j])
            possible = false;
        grid2[i][j] = 0;
        dfs(grid1, grid2, i+1, j);
        dfs(grid1, grid2, i, j+1);
        dfs(grid1, grid2, i-1, j);
        dfs(grid1, grid2, i, j-1);
    }
}