class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> temp_list, int[] nums){
        if(temp_list.size() == nums.length){
            list.add(new ArrayList<>(temp_list));
            return;
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(temp_list.contains(nums[i]))
                    continue;
                temp_list.add(nums[i]);
                backtrack(list, temp_list, nums);
                temp_list.remove(temp_list.size() - 1);
            }
        }
    }
}