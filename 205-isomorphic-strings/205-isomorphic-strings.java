class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(Integer i = 0; i < s.length(); i++){
            if(map.put(s.charAt(i), i) != map1.put(t.charAt(i),i))
                return false;
        }
        return true;
    }
}