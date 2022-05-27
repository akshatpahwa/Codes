class Solution {
    int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(heights == null || heights.length == 0 || heights[0].length == 0)
            return res;
        
        int row = heights.length, col = heights[0].length;
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];
        Queue<int[]> pQueue = new LinkedList<>();
        Queue<int[]> aQueue = new LinkedList<>();
        
        for(int i = 0; i < row; i++){
            pQueue.offer(new int[]{i,0});
            aQueue.offer(new int[]{i,col-1});
            pacific[i][0] = true;
            atlantic[i][col-1] = true;
        }
        
        for(int i = 0; i < col; i++){
            pQueue.offer(new int[]{0, i});
            aQueue.offer(new int[]{row-1,i});
            pacific[0][i] = true;
            atlantic[row-1][i] = true;
        }
        
        bfs(heights, pQueue, pacific);
        bfs(heights, aQueue, atlantic);
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(pacific[i][j] && atlantic[i][j])
                    res.add(List.of(i,j));
            }
        }
        return res;
    }
    
    public void bfs(int[][] matrix, Queue<int[]> queue, boolean[][] visited){
        int row = matrix.length, col = matrix[0].length; 
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            
            for(int[] d : dir){               
                int x = cur[0] + d[0];
                int y = cur[1] + d[1];
                
                if(x < 0 || y < 0 || x >= row || y >= col || visited[x][y] || matrix[x][y] < matrix[cur[0]][cur[1]])
                    continue;
                
                visited[x][y] = true;
                queue.offer(new int[]{x,y});
            }
        }
    }
}