class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 0; j < strs.length; j++){
                if(i < strs[j].length() && i < strs[0].length()){
                    if(strs[j].charAt(i) != strs[0].charAt(i))
                        return result;
                    if(j == strs.length-1)
                        result += strs[j].charAt(i);
                }
                else 
                    return result;
            }
        }
        return result;
    }
}