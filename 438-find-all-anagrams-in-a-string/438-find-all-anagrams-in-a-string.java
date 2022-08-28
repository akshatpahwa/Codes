public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(s.length() < p.length())
            return list;
        
        for(int i = 0; i < p.length(); i++){
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }
        int start = 0, end = p.length();
        if(Arrays.equals(freq1, freq2))
            list.add(start);
        while(end < s.length()){
            freq1[s.charAt(start)-'a']--;
            freq1[s.charAt(end)-'a']++;
            if(Arrays.equals(freq1, freq2))
                list.add(start+1);
            start++;
            end++;
        }
        return list;
    }
}