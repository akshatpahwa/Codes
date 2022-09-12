class Solution {
    public int minGroups(int[][] intervals) {
        //Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);   
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int[] interval : intervals){
            if(!minHeap.isEmpty() && minHeap.peek() < interval[0])
                minHeap.remove();
            minHeap.offer(interval[1]);
        }
        return minHeap.size();       
    }
}