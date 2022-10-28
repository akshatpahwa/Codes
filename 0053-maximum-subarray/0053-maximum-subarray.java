class Solution {
    public int maxSubArray(int[] nums) {
        // if(nums.length == 1)
        //     return nums[0];
        // if(nums.length == 0)
        //     return 0;
        int max = Integer.MIN_VALUE, sum = 0;
        for(int j = 0; j < nums.length; j++){
            sum = Math.max(nums[j], sum + nums[j]);
            max = Math.max(max, sum);
        }
        return max;
    }
}