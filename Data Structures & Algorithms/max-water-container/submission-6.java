class Solution {
    public int maxArea(int[] h) {

        int max=0;
        

        int left=0;

        int rigth=h.length-1;
        
        while(left<rigth){
            int width= rigth-left;

            int min=Math.min(h[left],h[rigth]);
            

            int area=min*width;

             max=Math.max(max, area);

             if(h[left]<h[rigth]){
                left++;
             }else{
                rigth--;
             }
        }
       return max; 
    }
}