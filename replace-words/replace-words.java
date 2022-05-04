class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set = new HashSet<>();
        String result = "";
        for(int i = 0; i < dictionary.size(); i++){
            set.add(dictionary.get(i));
        }
        String[] words = sentence.split("\\s");
        for(String word : words){
            String temp = "";
            for(int i = 0; i < word.length(); i++){
                temp += word.charAt(i);
                if((set.contains(temp)) || (i == word.length()-1)){
                    result += temp;
                    result += " ";
                    break;
                }
            }
        }
        return result.trim();
    }
}