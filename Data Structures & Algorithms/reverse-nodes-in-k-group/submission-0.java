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
    public ListNode reverseKGroup(ListNode head, int k) {
       
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            
           len++;

            temp=temp.next;
        }

        ListNode t=head;

        int arr[]=new int[len];
        int m=0;

        while(t!=null){
            
          arr[m++]=t.val;

            t=t.next;
        }

      
       int left=0;
     for (int start = 0; start + k <= arr.length; start += k) {
      twoPointer(arr, start, start + k);
      }
      
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
   
   public static void twoPointer(int arr[],int l,int pos){
   
     
     int left=l;
     int rigth=pos-1;
     
     while(left<=rigth){
       
       int temp=arr[left];
       arr[left]=arr[rigth];
       arr[rigth]=temp;
       
       left++;
       rigth--;
     }
  
   }
}
