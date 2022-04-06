class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        backtracking(nums, list, new ArrayList<>(), 0);
        return list;
    }
    public void backtracking(int[] nums, List<List<Integer>> list, List<Integer> tempList, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtracking(nums, list, tempList, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}