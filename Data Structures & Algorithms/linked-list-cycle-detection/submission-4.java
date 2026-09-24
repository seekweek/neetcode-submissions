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
    public boolean hasCycle(ListNode head) {

        ListNode temp=head;

        ListNode left=head;
        ListNode rigth=head;

        while( rigth!=null && rigth.next!=null && temp!=null){

           
           left=left.next;

           rigth=rigth.next.next;
           
            if(left==rigth && temp!=null){
                return true;
            }

        }

      return false;
        
    }
}
