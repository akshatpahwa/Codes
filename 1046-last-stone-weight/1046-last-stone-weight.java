class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        //112478
        for(int i = stones.length-1; i >= 0; i--){
            if(i-1 >= 0){
                stones[i-1] = stones[i] - stones[i-1];
            }
            Arrays.sort(stones);
        }
        return stones[0];
    }
}