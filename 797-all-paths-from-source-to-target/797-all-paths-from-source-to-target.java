class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, res, path);
        return res;
    }
    public void dfs(int[][] graph, int node, List<List<Integer>> res, List<Integer> path){
        if(node == graph.length-1){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int nextnode : graph[node]){
            path.add(nextnode);
            dfs(graph, nextnode, res, path);
            path.remove(path.size()-1);
        }
    }
}