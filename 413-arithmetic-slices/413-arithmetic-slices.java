class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0, count = 0;
        for(int i = 2; i < nums.length; i++){
            if(nums[i-1] - nums[i] == nums[i-2] - nums[i-1]){
                count++;
                result += count;
            }
            else
                count = 0;
        }
        return result;
    }
}