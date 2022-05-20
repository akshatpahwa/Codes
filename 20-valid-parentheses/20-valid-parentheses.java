class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else{
                if(stack.size() == 0)
                    return false;
                char temp = stack.pop();
                if(temp != c)
                    return false;
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}