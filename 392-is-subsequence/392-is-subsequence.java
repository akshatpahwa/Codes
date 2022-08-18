class Solution {
    public boolean isSubsequence(String s, String t) {
        int temp = 0;
        if(s.length() == 0 && t.length() != 0)
            return true;
        for(int i = 0; i < t.length(); i++){
            if(temp >= s.length())
                return true;
            if(s.charAt(temp) != t.charAt(i))
                continue;
            else
                temp++;
        }
        if(temp == s.length())
            return true;
        return false;
    }
}