/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode first = head;
        ListNode second = head;
        ListNode temp = head;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
            if(first == second)
                break;
        }
        if(first == second){
            while(temp != first){
                first = first.next;
                temp = temp.next;
            }
        }
        else
            return null;
        return first;
    }
}