class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || k <= 0)
            return new int[0];
        int length = nums.length;
        int[] arr = new int[length-k+1];
        int pointer = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        
        for(int i = 0; i < length; i++){
            while(!queue.isEmpty() && queue.peek() <= i-k){
                queue.poll();
            }
            while(!queue.isEmpty() && nums[queue.peekLast()] < nums[i]){
                queue.pollLast();
            }
            queue.offer(i);
            if(i >= k-1)
                arr[pointer++] = nums[queue.peek()];
        }
        
        return arr;
    }
}