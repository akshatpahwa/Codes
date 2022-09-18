class Solution {
    public int countBinarySubstrings(String s) {
        int cur = 1, pre = 0, res = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1))
                cur++;
            else{
                res += Math.min(cur, pre);
                pre = cur;
                cur = 1;
            }
        }
        return res + Math.min(cur, pre);
    }
}
//TC->O(N)
//SC->O(1)