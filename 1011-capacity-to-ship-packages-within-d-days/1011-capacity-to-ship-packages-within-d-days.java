class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for(int weight : weights){
            left = Math.max(left, weight);
            right += weight;
        }
        while(left < right){
            int mid = (left + right) / 2, day = 1, cur = 0;
            for(int weight : weights){
                if(cur + weight > mid){
                    day++;
                    cur = 0;
                }
                cur += weight;
            }
            if(day > days)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}