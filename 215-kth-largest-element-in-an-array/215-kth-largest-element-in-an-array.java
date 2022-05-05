class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums){
            pq.offer(val);
            if(pq.size() > k)
                pq.poll();
        }
        return pq.poll();
       /* Arrays.sort(nums);
        int temp = 0;
        for(int i = nums.length-1; i >= 0; i--){
            if(++temp == k)
                return nums[i];
        }
        return -1;*/
    }
}