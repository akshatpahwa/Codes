class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length-1])
                return search(matrix, i, 0, target);
        }
        return false;
    }
    public boolean search(int[][] matrix, int i, int j, int target){
        for(int col = 0; col < matrix[i].length; col++){
            if(matrix[i][col] == target)
                return true;
        }
        return false;
    }
}