class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            if(map.get(a)==map.get(b))
              return b-a;
			  //otherwise return based on frequency
            else return map.get(a)-map.get(b);
        });
        int[] arr = new int[nums.length];
        int j = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            pq.add(key);
        }
        for(int i = 0; i < arr.length; i++){
            if(pq.peek() == null)
                return arr;
            int temp = pq.peek();
            while(map.get(temp) > 0){
                map.put(temp, map.getOrDefault(temp, 0) - 1);
                arr[j++] = temp;
                //System.out.println(arr[j-1]);
            }
            pq.poll();
        }
        return arr;
    }
}