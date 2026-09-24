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
    public ListNode removeNthFromEnd(ListNode head, int n) {
             ArrayList<Integer>arr=new ArrayList<>();

        ListNode temp=head;

        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }

        int breakPoint=arr.size()-n;

        ArrayList<Integer>rs=new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            
            if(i== breakPoint){
                continue;
            }else{
                rs.add(arr.get(i));
            }

        }

        ListNode H=null;
        ListNode T=null;

        for(int e:rs){
            ListNode tem=new ListNode(e);

            if(H==null){
                H=tem;
                T=tem;
            }else{
                T.next=tem;
                T=tem;
            }
        }

        return H;
    }
}
