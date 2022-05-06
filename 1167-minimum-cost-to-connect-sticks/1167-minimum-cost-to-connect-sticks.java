class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;
        for(int stick : sticks){
            pq.add(stick);
        }
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            cost = cost + first + second;
            pq.add(first + second);
        }
        return cost;
    }
}