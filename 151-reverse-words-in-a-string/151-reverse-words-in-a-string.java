class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        Stack<String> stack = new Stack<>();
        String temp = "", result = "";
        for(char c : s.toCharArray()){
            if(c == ' '){
                if(temp != "")
                    stack.push(temp);
                temp = "";
            }
            else
                temp += c;
        }
        if(temp != null)
            stack.push(temp);
        int size = stack.size();
        for(int i = 0; i < size; i++){
            result += stack.pop();
            if(i != size-1)
                result += " ";
        }
        return result;
    }
}