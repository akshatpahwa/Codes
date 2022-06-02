class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                arr[0] = i;
                arr[1] = map.get(temp);
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}