class Solution {
    public int numRescueBoats(int[] p, int limit) {
        
        int l=p.length;
        int Cnt=0;
        int left=0;
        int rigth=p.length-1;

        Arrays.sort(p);
        while(left<=rigth){
          if(p[left]+p[rigth]<=limit){
            Cnt++;
            left++;
            rigth--;
          }else{
            rigth--;
            Cnt++;
          }
           
        }
        return Cnt;
    }
}