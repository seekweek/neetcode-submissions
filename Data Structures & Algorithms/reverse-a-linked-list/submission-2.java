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

    //     ArrayList<Integer>arr=new ArrayList<>();

    //     ListNode temp=head;

    //     while(temp!=null){
    //         arr.add(temp.val);
    //         temp=temp.next;
    //     }
      
    //   ListNode H=null;
    //   ListNode T=null;

    //   for(int i=arr.size()-1;i>=0;i--){
    //     int value=arr.get(i);
    //     ListNode D=new ListNode(value);
    //     if(H==null){
    //         H=D;
    //         T=D;
    //     }else{
    //         T.next=D;
    //         T=D;
    //     }
    //   }

    //     return H;

    ListNode prev=null;

    ListNode curr=head;

    while(curr!=null){

        ListNode nexts=curr.next;

        curr.next=prev;

        prev=curr;
        curr=nexts;
    }
    return prev;
    }
}
