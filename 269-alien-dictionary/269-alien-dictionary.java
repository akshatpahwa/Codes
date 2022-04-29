class Solution {
    public String alienOrder(String[] words) {    
        //step 1-> create ds and find all unique letters
        Map<Character, Set<Character>> map = new HashMap<>();
        Map<Character, Integer> degree = new HashMap<>();
        String result = "";
        if(words == null || words.length == 0)
            return result;
        
        for(String word : words){
            for(char c : word.toCharArray()){
                degree.put(c, 0);
            }
        }
        
        for(int i = 0; i < words.length-1; i++){
            String cur = words[i];
            String next = words[i+1];
            if (cur.length() > next.length() && cur.startsWith(next)) {
                return "";
            }
            int length = Math.min(cur.length(), next.length());
            for(int j = 0; j < length; j++){
                char c1 = cur.charAt(j);
                char c2 = next.charAt(j);
                if(c1 != c2){
                    Set<Character> set = new HashSet<Character>();
                    if(map.containsKey(c1))
                        set = map.get(c1);
                    if(!set.contains(c2)){
                        set.add(c2);
                        map.put(c1, set);
                        degree.put(c2, degree.get(c2) + 1);
                    }
                    break;
                }
            }
        }
        
        Queue<Character> q = new LinkedList<Character>();
        for(char c : degree.keySet()){
            if(degree.get(c) == 0)
                q.add(c);
        }
        while(!q.isEmpty()){
            char c = q.remove();
            result += c;
            if(map.containsKey(c)){
                for(char c2 : map.get(c)){
                    degree.put(c2, degree.get(c2) - 1);
                    if(degree.get(c2) == 0)
                        q.add(c2);
                }
            }
        }
        
        if(result.length() != degree.size())
            return "";
        return result;
    }
}