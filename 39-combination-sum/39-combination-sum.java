class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, candidates, 0, new ArrayList<>(), target);
        return list;
    }
    public void backtrack(List<List<Integer>> list, int[] candidates,int start, List<Integer> tempList, int target){
        if(target < 0)
            return;
        else if(target == 0)
            list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < candidates.length; i++){
                tempList.add(candidates[i]);
                backtrack(list, candidates, i, tempList, target - candidates[i]);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}