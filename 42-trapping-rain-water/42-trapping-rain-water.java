class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int left_max = 0, right_max = 0;
        int result = 0;
        while(left < right){
            left_max = Math.max(left_max, height[left]);
            right_max = Math.max(right_max, height[right]);
            if(height[right] > height[left]){
                result += left_max - height[left];
                left++;
            }
            else{
                result += right_max - height[right];
                right--;
            }
        }
        return result;
    }
}