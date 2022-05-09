class Solution {
    public int tribonacci(int n) {
        if(n < 2)
            return n;
        int first = 0, second = 1, third = 1, forth;
        while(n-- > 2){
            forth = first + second + third;
            first = second;
            second = third;
            third = forth;
        }
        return third;
    }
}