/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    //recursive version
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        ListNode head;
        if(l1.val < l2.val){
            head = l1;
            //fully believing
            head.next = mergeTwoLists(l1.next, l2); 
        }
        else{
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
}
//head以及head.next需要分别进行赋值