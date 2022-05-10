class Solution {
    public int jump(int[] nums) {
        int farthest = 0, currentJumpEnd = 0, jump = 0;
        for(int i = 0; i < nums.length-1; i++){
            farthest = Math.max(farthest, i + nums[i]);
            if(i == currentJumpEnd){
                jump++;
                currentJumpEnd = farthest;
            }
        }
        return jump;
    }
}