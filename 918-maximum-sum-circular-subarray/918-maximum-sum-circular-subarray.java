class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0, max_sum = nums[0], cur_max = 0;
        int min_sum = nums[0], cur_min = 0;
        for(int i = 0; i < nums.length; i++){
            cur_max = Math.max(cur_max + nums[i], nums[i]);
            max_sum = Math.max(max_sum, cur_max);
            total += nums[i];
            cur_min = Math.min(cur_min + nums[i], nums[i]);
            min_sum = Math.min(cur_min, min_sum);
        }
        return max_sum > 0 ? Math.max(max_sum, total - min_sum) : max_sum; 
    }
}