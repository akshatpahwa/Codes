class Solution {
    public int maxProduct(int[] nums) {
    
        if(nums.length == 0 || nums == null)
            return -1;
        
        int max = nums[0], min = nums[0], result = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            int temp = max;
            max = Math.max(Math.max(nums[i] * max, nums[i] * min), nums[i]);
            min = Math.min(Math.min(nums[i] * min, nums[i] * temp), nums[i]);
            result = Math.max(max, result);
        }
        
        return result;
    }
}