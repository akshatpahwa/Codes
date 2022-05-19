class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 0, max = 1;
        long sum = k;
        while(right < nums.length){
            sum += nums[right];
            while(nums[right] * (right - left + 1) > sum){
                sum -= nums[left];
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}