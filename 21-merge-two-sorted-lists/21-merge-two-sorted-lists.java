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
        ListNode head = new ListNode(0);
        ListNode result = head;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                result.next = list1;
                list1 = list1.next;
            }
            else{
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        if(list1 != null){
            //System.out.println("Inside if");
            result.next = list1;
            //list1 = list1.next;
            //result = result.next;
        }
        if(list2 != null){
            result.next = list2;
            //list2 = list2.next;
            //result = result.next;
        }
        return head.next;
    }
}