class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int count = 0, row = maze.length, col = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(entrance);
        maze[entrance[0]][entrance[1]] = '^';
        int[][] dirs = {{-1,0},{0,-1},{1,0},{0,1}};
        while(!queue.isEmpty()){
            int size = queue.size();
            count++;
            for(int i = 0; i < size; i++){
                int[] point = queue.poll();
                for(int[] dir : dirs){
                    int x = dir[0] + point[0];
                    int y = dir[1] + point[1];
                    if(x >= 0 && x < row && y >= 0 && y < col && maze[x][y] == '.'){
                        if(x == 0 || y == 0 || x == maze.length-1 || y == maze[0].length-1)
                            return count;
                        queue.add(new int[]{x,y});
                        maze[x][y] = '^';
                    }
                }
            }
        }
        return -1;
    }
}