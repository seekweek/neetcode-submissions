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
    public ListNode reverseList(ListNode head) {

        Stack<Integer>st=new Stack<>();

        ListNode temp=head;

        while(head!=null){
             st.add(head.val);
             head=head.next;
        }

        ListNode H=null;
        ListNode T=null;

        while(!st.isEmpty()){
            int data=st.pop();
            ListNode d=new ListNode(data);
            if(H==null){
                H=d;
                T=d;
            }else{
                T.next=d;
                T=d;
            }
        }
        return H;
        
    }
}
