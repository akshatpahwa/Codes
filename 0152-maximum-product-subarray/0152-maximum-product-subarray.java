class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0];
        int result = max;
        for(int i = 1; i < nums.length; i++){
            int temp = Math.max(nums[i], Math.max(max*nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(max*nums[i], min * nums[i]));
            max = temp;
            result = Math.max(max, result);
        }
        return result;
    }
}