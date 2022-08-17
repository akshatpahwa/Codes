class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            sum -= nums[i];
            if(temp == sum)
                return i;
            temp += nums[i];
        }
        return -1;
    }
}