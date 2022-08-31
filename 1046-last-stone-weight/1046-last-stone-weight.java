class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max_heap = new PriorityQueue<>((a,b)-> b - a);
        for(int stone : stones){
            max_heap.offer(stone);
        }
        while(max_heap.size() > 1){
            max_heap.offer(max_heap.poll() - max_heap.poll());
        }
        return max_heap.poll();
    }
}