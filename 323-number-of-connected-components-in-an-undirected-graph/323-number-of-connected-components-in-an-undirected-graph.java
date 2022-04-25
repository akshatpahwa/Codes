class Solution {
    public int countComponents(int n, int[][] edges) {
        int component = n;
        int[] nums = new int[n];
        Arrays.fill(nums, -1);
        
        for(int i = 0; i < edges.length; i++){
            int x = find(nums, edges[i][0]);
            int y = find(nums, edges[i][1]);
            
            if(x != y){
                nums[x] = y;
                component--;
            }
        }
        return component;
    }
    public int find(int[] nums, int i){
        if(nums[i] == -1)
            return i;
        return find(nums, nums[i]);
    }
}