class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1)
            return n;
        int first = 1, second = 2;
        int third = 0;
        for(int i = 2; i < n ; i++){
            third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}