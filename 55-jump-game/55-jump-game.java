class Solution {
    public boolean canJump(int[] nums) {
        int last_pos = nums.length-1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= last_pos)
                last_pos = i;
        }
        return last_pos == 0;
    }
}