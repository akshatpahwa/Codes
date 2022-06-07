/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode head : lists){
            while(head != null){
                minHeap.add(head.val);
                head = head.next;
            }
        }
        ListNode result = new ListNode(-1);
        ListNode head = result;
        
        while(!minHeap.isEmpty()){
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }
        return result.next; 
    }
}