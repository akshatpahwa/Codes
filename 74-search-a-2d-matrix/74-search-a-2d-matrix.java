class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int left = 0, right = row * col - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int mid_point = matrix[mid/col][mid%col];
            if(mid_point == target)
                return true;
            else if(mid_point < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}