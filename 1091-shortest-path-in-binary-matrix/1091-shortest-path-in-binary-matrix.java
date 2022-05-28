class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        if(m == 1 && n == 1 && grid[0][0] == 0)
            return 1;
        int result = 2;
        Queue<int[]> queue = new LinkedList<>();
        if(grid[0][0] == 0)
            queue.offer(new int[]{0,0});
        if(queue.size() == 0 || grid[m-1][n-1] != 0 || grid[0][0] != 0)
            return -1; 
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{-1,1},{1,-1}};
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[] point = queue.poll();
                for(int[] dir : dirs){
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
                    if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 0){
                        if(m - 1 == x && n - 1 == y)
                            return result;
                        grid[x][y] = 1;
                        queue.offer(new int[]{x,y});
                    }
                }
            }
            result++;
        }
        return -1;
    }
}