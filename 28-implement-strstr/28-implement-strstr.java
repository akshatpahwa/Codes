class Solution {
    public int strStr(String haystack, String needle) {
        int count = 0;
        if(needle == "" || needle == null)
            return 0;
        for(int i = 0; i < haystack.length(); i++){
            if(count == needle.length())
                return i-count;
            if(haystack.charAt(i) == needle.charAt(count))
                count++;
            else{
                i -= count;
                count = 0;
            }
            if(count == needle.length())
                return i-count+1;
        }
        return -1;
    }
}