class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[128];
        for(char c : t.toCharArray()){
            map[c]++;
        }
        int start = 0, end = 0, minstart = 0, minlen = Integer.MAX_VALUE, counter = t.length();
        while(end < s.length()){
            char c1 = s.charAt(end);
            if(map[c1] > 0) 
                counter--;
            map[c1]--;
            end++;
            
            while(counter == 0){
                if(minlen > end - start){
                    minlen = end - start;
                    minstart = start;
                }
                char c2 = s.charAt(start);    
                map[c2]++;
                if(map[c2] > 0)
                    counter++;
                start++;
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(minstart, minstart + minlen);
    }
}