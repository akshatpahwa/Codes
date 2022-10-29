class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int low = 0; low < nums.length - 2; low++){
            if (low == 0 || (low > 0 && nums[low] != nums[low-1])) {
                int j = low + 1;
                int high = nums.length - 1;
                while(j < high){
                    if(nums[low] + nums[j] + nums[high] == 0){
                        result.add(Arrays.asList(nums[low], nums[j], nums[high]));
                        while(j < high && nums[j] == nums[j+1]){
                            j++;
                        }
                        while(j < high && nums[high] == nums[high-1]){
                            high--;
                        }
                        j++;
                        high--;
                    }
                    else if(nums[low] + nums[j] + nums[high] < 0)
                        j++;
                    else if(nums[low] + nums[j] + nums[high] > 0)
                        high--;
                }
            }
        }
        return result;
    }
}