class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res = 0, cur = 0;
        for(int value : values){
            res = Math.max(res, cur + value);
            cur = Math.max(cur, value) - 1;
        }
        return res;
    }
}