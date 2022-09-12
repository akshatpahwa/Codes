class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int[] interval : intervals){
            if(!minHeap.isEmpty() && minHeap.peek() < interval[0])
                minHeap.remove();
            minHeap.offer(interval[1]);
        }
        return minHeap.size();
    }
}