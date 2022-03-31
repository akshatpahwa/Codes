class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = nums.length / 3;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : nums){
            if(!list.contains(num) && map.get(num) > count)
                list.add(num);
        }
        return list;
    }
}