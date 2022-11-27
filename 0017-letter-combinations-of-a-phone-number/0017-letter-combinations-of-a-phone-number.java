class Solution {
    private static final String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        if(digits.length() == 0)
            return list;
        backtrack("", digits, 0, list);
        return list;
    }
    
    private void backtrack(String prefix, String digits, int offset, List<String> ret) {
        if (offset >= digits.length()) {
            ret.add(prefix);
            return;
        }
        String letters = keys[(digits.charAt(offset) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            backtrack(prefix + letters.charAt(i), digits, offset + 1, ret);
        }
    }
}