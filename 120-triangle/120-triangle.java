class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int row = triangle.size() - 2; row >= 0; row--){
            for(int col = 0; col <= row; col++){
                int best_below = Math.min(
                triangle.get(row + 1).get(col),
                triangle.get(row + 1).get(col + 1));
                triangle.get(row).set(col, best_below + triangle.get(row).get(col));
            }
        }
        return triangle.get(0).get(0);
    }
}