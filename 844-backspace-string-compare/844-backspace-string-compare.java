class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '#')
                stack.push(c);
            else{
                if(!stack.isEmpty())
                    stack.pop();
            }
        }
        for(char c : t.toCharArray()){
            if(c != '#')
                stack1.push(c);
            else{
                if(!stack1.isEmpty())
                    stack1.pop();
            }
        }
        if(stack.equals(stack1))
            return true;
        return false;
    }
}