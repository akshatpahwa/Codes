class Solution {
    public int minFlipsMonoIncr(String s) {
        int one = 0, flip = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                if(one != 0)
                    flip++;
                else 
                    continue;
            }
            else
                one++;
            if(flip > one)
                flip = one;
        }
        return flip;
    }
}