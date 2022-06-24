class Solution {
    public int getFood(char[][] grid) {
        int row = grid.length, col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '*'){
                    queue.offer(new int[]{i,j});
                    break;
                }
            }
        }
        int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
        int count = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            count++;
            for(int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for(int[] dir : dirs){
                    int x = dir[0] + point[0];
                    int y = dir[1] + point[1];
                    if(x >= 0 && x < row && y >= 0 && y < col && grid[x][y] != 'X'){
                        if(grid[x][y] == '#')
                            return count;    
                        if(grid[x][y] == 'O'){
                            queue.offer(new int[]{x,y});
                            grid[x][y] = 'X';
                        }
                    }
                }
            }
        }
        return -1;
    }
}