class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        int[] result = new int[k];
        
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        
        for(int key : map.keySet()){
            heap.add(key);
            if(heap.size() > k){
                heap.poll();
            }
        }
        
        for(int i = 0; i < result.length; i++){
            result[i] = heap.poll();
        }
        return result;
    }
}