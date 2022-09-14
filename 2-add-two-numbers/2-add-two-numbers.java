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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;
            ListNode cur = new ListNode(0);
            if(l1 != null)
                sum += l1.val;
            if(l2 != null)
                sum += l2.val;
            sum += carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = prev.next;
            //prev = cur;
            
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }
}