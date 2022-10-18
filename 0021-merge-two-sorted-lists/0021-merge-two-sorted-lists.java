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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode result = new ListNode(0);
        ListNode iter = result;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                iter.next = head1;
                head1 = head1.next;
            }
            else{
                iter.next = head2;
                head2 = head2.next;
            }
            iter = iter.next;
        }
        while(head1 != null){
            iter.next = head1;
            head1 = head1.next;
            iter = iter.next;
        }
        while(head2 != null){
            iter.next = head2;
            head2 = head2.next;
            iter = iter.next;
        }
        return result.next;
    }
}