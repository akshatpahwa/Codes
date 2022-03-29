class Solution {
    public int majorityElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num) > nums.length/2)
                max = num;
        }
        return max;
    }
}