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
    public void reorderList(ListNode head) {
        if(head == null)
            return;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null, cur = slow, temp;
        while(cur != null){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
        ListNode first = head, second = prev;
        while(second.next != null){
            temp = first.next;
            first.next = second;
            first = temp;
            
            temp = second.next;
            second.next = first;
            second = temp;
        }
    }
}
//TC->O(N)
//SC->O(1)