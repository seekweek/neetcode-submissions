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
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer>arr=new ArrayList<>();


        for(int i=0;i<lists.length;i++){
            ListNode current=lists[i];

            while(current!=null){
                 arr.add(current.val);

                current=current.next;
            }
        }
      Collections.sort(arr);


      ListNode H=null;
      ListNode T=null;

      for(int e:arr){
        ListNode D=new ListNode(e);
        if(H==null){
            H=D;
            T=D;
        }else{
            T.next=D;
            T=D;
        }
      }
   
     return H;

    }
}
