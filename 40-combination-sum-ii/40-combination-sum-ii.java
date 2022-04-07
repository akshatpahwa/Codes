class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, candidates, 0, new ArrayList<>(), target);
        return list;
    }
    public void backtrack(List<List<Integer>> list, int[] candidates,int start, List<Integer> tempList, int target){
        if(target < 0)
            return;
        else if(target == 0){
            Collections.sort(tempList);
            if(!list.contains(tempList))
                list.add(new ArrayList<>(tempList));
        }
        else{
            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i-1]) continue;
                tempList.add(candidates[i]);
                backtrack(list, candidates, i+1, tempList, target - candidates[i]);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}