class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max_count = nums.length / 3;
        int count1 = 0, count2 = 0, num1 = -1, num2 = -1;
        for(int num : nums){
            if(num1 == num)
                count1++;
            else if(num2 == num)
                count2++;
            else if(count1 == 0){
                num1 = num;
                count1++;
            }
            else if(count2 == 0){
                num2 = num;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == num1)
                count1++;
            else if(num == num2)
                count2++;
        }
        if(count1 > max_count)
            list.add(num1);
        if(count2 > max_count)
            list.add(num2);
        return list;
    }
}