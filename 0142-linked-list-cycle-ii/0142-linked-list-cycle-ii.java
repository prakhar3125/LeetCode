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
        
        ListNode meet = exist(head);
        if(meet==null){
            return null;
        }
        ListNode temp = head;
        while(temp!=meet){
            meet=meet.next;
            temp=temp.next;
        }
        return temp;

        

        
    }
    public static ListNode exist(ListNode head){
        ListNode fast=head;
        ListNode slow = head;
        
        while(fast!=null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return fast;
            }
        }
        return null;
    }
}