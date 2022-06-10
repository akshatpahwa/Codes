class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for(int i = 0; i < strs[0].length(); i++){
            boolean val = helper(strs, strs[0].charAt(i), i);
            if(val == true)
                result += strs[0].charAt(i);
            else 
                return result;
        }
        return result;
    }
    public boolean helper(String[] strs, char z, int i){
        for(String str : strs){
            if(str.length() <= i)
                return false;
            if(str.charAt(i) != z)
                return false;
        }
        return true;
    }
}