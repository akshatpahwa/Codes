class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxRepeat = 0, maxWindow = 0;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
			if(!map.containsKey(ch)) {
				map.put(ch, 0);
			}
			map.put(ch, map.get(ch) + 1);
            maxRepeat = Math.max(maxRepeat, map.get(ch));
            if(right - left + 1 - maxRepeat > k){
                char remove = s.charAt(left);
                map.put(remove, map.get(remove)-1);
                left++;
            }
            maxWindow = Math.max(maxWindow, right - left + 1);
        }
        return maxWindow;
    }
}