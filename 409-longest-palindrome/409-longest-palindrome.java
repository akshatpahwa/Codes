class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        boolean one = false;
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : s.toCharArray()){
            if(map.get(c) % 2 == 0){
                count += map.get(c);
                map.put(c,0);
            }
            else{
                count += map.get(c)-1;
                one = true;
                map.put(c,0);
            }
        }
        if(one == true)
            return count+1;
        return count;
    }
}