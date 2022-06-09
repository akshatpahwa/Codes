class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int result = 0;
        int num = x;
        while(num > 0){
            result = result * 10 + num % 10;
            num = num / 10;
        }
        if(result == x)
            return true;
        return false;
    }
}