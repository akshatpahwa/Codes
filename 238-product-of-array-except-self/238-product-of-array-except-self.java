class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 0);
        int zero = 0;
        int product = 1;
        for(int num : nums){
            if(num == 0)
                zero++;
            else
                product *= num;
        }
        if(zero >= 2)
            return arr;
        else if(zero == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0)
                    arr[i] = product;
            }
        }
        else{
            for(int i = 0; i < nums.length; i++){
                arr[i] = product/nums[i];
            }
        }
        return arr;
    }
}