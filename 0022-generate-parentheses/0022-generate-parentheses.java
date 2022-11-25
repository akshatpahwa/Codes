class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    public void backtrack(List<String> list, String name, int open, int close, int end){
        if(name.length() == end*2){
            list.add(name);
            return;
        }
        if(open < end){
            backtrack(list, name + "(", open + 1, close, end);
        }
        if(close < open){
            backtrack(list, name + ")", open, close + 1, end);
        }
    }
}