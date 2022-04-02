class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        int count = 0, max = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : nums){
            if(!set.contains(num-1)){
                int temp = num+1;
                count = 1;
                while(set.contains(temp)){
                    count++;
                    temp++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}