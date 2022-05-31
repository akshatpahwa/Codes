class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] arr = new boolean[rooms.size()];
        arr[0] = true;
        dfs(rooms, 0, arr);
        for(int i = 0; i < arr.length; i++){
            //System.out.println(arr[i]);
             if(arr[i] == false)
                 return false;
        }
        return true;        
    }
    public void dfs(List<List<Integer>> rooms, int node, boolean[] arr){
        for(int nextnode : rooms.get(node)){
            if(arr[nextnode] == true)
                continue;
            arr[nextnode] = true;
            dfs(rooms, nextnode, arr);
        }
    }
}