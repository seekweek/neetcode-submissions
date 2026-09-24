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
        //      ArrayList<Integer>arr=new ArrayList<>();

        // ListNode temp=head;

        // while(temp!=null){
        //     arr.add(temp.val);
        //     temp=temp.next;
        // }

        // int breakPoint=arr.size()-n;

        // ArrayList<Integer>rs=new ArrayList<>();

        // for(int i=0;i<arr.size();i++){
            
        //     if(i== breakPoint){
        //         continue;
        //     }else{
        //         rs.add(arr.get(i));
        //     }

        // }

        // ListNode H=null;
        // ListNode T=null;

        // for(int e:rs){
        //     ListNode tem=new ListNode(e);

        //     if(H==null){
        //         H=tem;
        //         T=tem;
        //     }else{
        //         T.next=tem;
        //         T=tem;
        //     }
        // }

        // return H;
                 int len=0;
        ListNode temp=head;


        while(temp!=null){
             len++;
            temp=temp.next;
        }


       int breakPoint=len-n;

        ListNode H=null;
        ListNode T=null;
         
        ListNode tem=head;
        int mange=0;

        while(tem!=null){
             
             if(mange==breakPoint){
                mange++;
                tem=tem.next;
                continue;
             }else{
             
               ListNode D=new ListNode(tem.val);
               
                if(H==null){
                    H=D;
                    T=D;
                }else{
                    T.next=D;
                    T=D;
                }


            }

            mange++;

            tem=tem.next;
        }


      
        return H;
    }
}
