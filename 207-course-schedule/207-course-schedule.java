class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] arr = new ArrayList[numCourses];
        ArrayList<Integer> bfs = new ArrayList<>();
        int[] degree = new int[numCourses];
        
        for(int i = 0; i < numCourses; i++){
            arr[i] = new ArrayList<Integer>();
        }
        for(int[] val : prerequisites){
            arr[val[1]].add(val[0]);
            degree[val[0]]++;
        }
        for(int i = 0; i < numCourses; i++){
            if(degree[i] == 0)
                bfs.add(i);
        }
        for(int i = 0; i < bfs.size(); i++){
            for(int j : arr[bfs.get(i)]){
                if(--degree[j] == 0)
                    bfs.add(j);
            }
        }
        return bfs.size() == numCourses;
    }
}