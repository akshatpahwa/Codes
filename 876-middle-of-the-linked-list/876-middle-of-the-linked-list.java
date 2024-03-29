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
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(second.next != null && second.next.next != null){
            first = first.next;
            second = second.next.next;
        }
        return second.next == null ? first : first.next;
    }
}