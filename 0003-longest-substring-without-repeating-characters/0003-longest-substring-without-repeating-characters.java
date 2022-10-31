class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            for(int j = i; j < s.length(); j++){
                char c = s.charAt(j);
                if(set.contains(c))
                    break;
                count++;
                set.add(c);
            }
            set.clear();
            max = Math.max(max, count);
        }
        return max;
    }
}