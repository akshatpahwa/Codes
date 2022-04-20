class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int row = mat.length;
        int col = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(mat[i][j] == 0)
                    queue.offer(new int[] {i,j});
                else
                    mat[i][j] = Integer.MAX_VALUE;
            }
        }
        
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            for(int[] d : dirs){
                int r = cell[0] + d[0];
                int c = cell[1] + d[1];
                if(r < 0 || r >= row || c < 0 || c >= col || mat[r][c] <= mat[cell[0]][cell[1]] + 1)
                    continue;
                queue.add(new int[] {r, c});
                mat[r][c] = mat[cell[0]][cell[1]] + 1;
            }
        }
        return mat;
    }
}