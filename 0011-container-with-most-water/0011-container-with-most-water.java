class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length-1;
        int max = 0;
        while(start < end){
            int distance = end - start;
            int result = distance * Math.min(height[start], height[end]);
            max = Math.max(max, result);
            if(height[end] < height[start])
                end--;
            else
                start++;
        }
        return max;
    }
}