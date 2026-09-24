class Solution {
    public int maxArea(int[] h) {

        int MaxArea=0;

        int left=0;
        int rigth=h.length-1;

        while(left<rigth){
           
           int distance=rigth-left;

           int minH=Math.min(h[left],h[rigth]);

           MaxArea=Math.max(MaxArea,distance*minH);

           if(h[left]<h[rigth]){
            left++;
           }else{
            rigth--;
           }

        }
        return MaxArea;
    }
}
