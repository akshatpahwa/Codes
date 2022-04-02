class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0, right = 0, max = 0;
        int length = s.length();
        while(right < length){
            if(map.containsKey(s.charAt(right)))
                left = Math.max(map.get(s.charAt(right))+1,left);
            map.put(s.charAt(right),right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
        /*int i = 0, j = 0, max = 0;
        HashSet<Character> set = new HashSet<>();
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }
            else
                set.remove(s.charAt(i++));
        }
        return max;
    }
}*/