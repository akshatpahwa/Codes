class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length, col = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(mat[i][j] == 0)
                    queue.offer(new int[]{i,j});
                else
                    mat[i][j] = Integer.MAX_VALUE;
            }
        }
        
        int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
        while(!queue.isEmpty()){
            int[] point = queue.poll();
            for(int[] dir : dirs){
                int x = dir[0] + point[0];
                int y = dir[1] + point[1];
                if(x >= 0 && x < row && y >= 0 && y < col && mat[x][y] > mat[point[0]][point[1]] + 1){
                    queue.add(new int[]{x,y});
                    mat[x][y] = mat[point[0]][point[1]] + 1;
                }
            }
        }
        return mat;
    }
}