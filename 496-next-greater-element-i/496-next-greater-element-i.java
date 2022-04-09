class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[nums1.length];
        int i = 0;
        for(int num : nums2){
            while(!stack.isEmpty() && num > stack.peek())
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for(int num : nums1){
            arr[i++] = map.getOrDefault(num, -1);
        }
        return arr;
    }
}