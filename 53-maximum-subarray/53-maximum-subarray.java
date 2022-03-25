class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sub_max = nums[0];
        for(int i = 1; i < nums.length; i++){
            max += nums[i];
            max = Math.max(max,nums[i]);
            sub_max = Math.max(sub_max, max);
        }
        return sub_max;
    }
}