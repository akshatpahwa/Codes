class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] arr = new int[26];
        int[] arr1 = new int[26];
        int min = Integer.MAX_VALUE;
        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c : target.toCharArray()){
            arr1[c-'a']++;
        }
        for(char c : target.toCharArray()){
            if(arr[c-'a'] < min)
                min = arr[c-'a'] / arr1[c-'a'];
        }
        return min;
    }
}