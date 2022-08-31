class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                 (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
        );
        ArrayList<String> list = new ArrayList<>();
        
        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            pq.offer(entry);
            if(pq.size() > k)
                pq.poll();
        }
        
        while(!pq.isEmpty()){
            list.add(0, pq.poll().getKey());
        }
        
        return list;
    }
}