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
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
        //O(n+m)-tc;  O(n+m)-space
    }
}
        /*ListNode head = new ListNode(0);
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
        if(list1 != null)
            result.next = list1;
        if(list2 != null)
            result.next = list2;
        return head.next;
        //O(n+m)-tc;  O(1)-space
    }
}*/