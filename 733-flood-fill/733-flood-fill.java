class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int temp = image[sr][sc];
        if(temp != newColor)
            helper(image, sr, sc, newColor, temp);
        return image;
    }
    public void helper(int[][] image, int i, int j, int val, int temp){
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != temp)
            return;
        image[i][j] = val;
        helper(image, i + 1, j, val, temp);
        helper(image, i, j + 1, val, temp);
        helper(image, i, j - 1, val, temp);
        helper(image, i - 1, j, val, temp);
    }
}