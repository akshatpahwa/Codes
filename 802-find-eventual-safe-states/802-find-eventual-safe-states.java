class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList();
        if(graph == null || graph.length == 0)
            return res;
        int node_count = graph.length;
        int[] color = new int[node_count];
        for(int i = 0; i < node_count; i++){
            if(dfs(graph, i, color))
                res.add(i);
        }
        return res;
    }
    public boolean dfs(int[][] graph, int start, int[] color){
        if(color[start] != 0)
            return color[start] == 1;
        color[start] = 2;
        for(int newNode : graph[start]){
            if(!dfs(graph, newNode, color))
                return false;
        }
        color[start] = 1;
        return true;
    }
}