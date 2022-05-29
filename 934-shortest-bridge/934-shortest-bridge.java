class Solution {
    Queue<int[]> queue = new LinkedList<>();
    public int shortestBridge(int[][] grid) {
        int row = grid.length, col = grid[0].length, count = 0;
        boolean flag = false;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i, j);
                    flag= true;
                    break;
                }
            }
            if(flag == true)break;
        }
        int[][] dirs = {{-1,0},{0,-1},{1,0},{0,1}};
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[] point = queue.poll();
                for(int[] dir : dirs){
                    int x = dir[0] + point[0];
                    int y = dir[1] + point[1];
                    if(x >= 0 && x < row && y >= 0 && y < col && grid[x][y] != -1){
                        if(grid[x][y] == 1)
                            return count;
                        grid[x][y] = -1;
                        queue.add(new int[]{x,y});
                    }
                }
            }
            count++;
        }
        return -1;
    }
    
    public void dfs(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i > grid.length-1 || j > grid[0].length-1 || grid[i][j] != 1){
            return;
        }
        queue.add(new int[]{i,j});
        grid[i][j] = -1;
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
    }
}