class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        for(int num : nums){
            set.add(num);
        }
        while(count <= nums.length){
            if(!set.contains(count))
                return count;
            count++;
        }
        return count;
        // Arrays.sort(nums);//[7,8,9,11,12]
        // int positive = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] >= 0){
        //         positive = nums[i];
        //         break;
        //     }
        // }
        // for(int i = positive+1; i < nums.length; i++){
        //     if(nums[i-1]+1 != nums[i])
        //         return nums[i-1] + 1;
        // }
        // return nums[nums.length-1]+1;
    }
}