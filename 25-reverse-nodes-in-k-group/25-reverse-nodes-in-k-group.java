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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode ptr = head;
        while(count < k && ptr != null){
            ptr = ptr.next;
            count++;
        }
        if(count == k){
            ListNode reverseHead = reverseList(head, k);
            head.next = reverseKGroup(ptr, k);
            return reverseHead;
        }
        return head;
    }
    public ListNode reverseList(ListNode head, int k){
        ListNode new_head = null;
        ListNode ptr = head;
        while(k > 0){
            ListNode new_node = ptr.next;
            ptr.next = new_head;
            new_head = ptr;
            ptr = new_node;
            k--;
        }
        return new_head;
    }
}