class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], result = max;
        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            int temp = Math.max(num, Math.max(max*num, min*num));
            min = Math.min(num, Math.min(max*num, min*num));                           max = temp;
            result = Math.max(max, result);
        }
        return result;
    }
}