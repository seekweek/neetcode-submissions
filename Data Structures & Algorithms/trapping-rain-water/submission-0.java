class Solution {
    public int trap(int[] h) {


        int leftMax[]=new int[h.length];
        int rigthMax[]=new int[h.length];
        
        
     // pehle Hum left trf ak Max nikalenge ok

     leftMax[0]=h[0];

     for(int i=1;i<h.length;i++){
        leftMax[i]=Math.max( h[i],leftMax[i-1]);
     }

     // Yb rigth Max value nikalenge ok 

     rigthMax[h.length - 1]=h[h.length-1];
     for(int i=h.length-2;i>=0;i--){
        rigthMax[i]=Math.max(h[i],rigthMax[i+1]);
     }


  int TrappingWater=0;
  for(int i=0;i<h.length;i++){
   int water= Math.min(leftMax[i],rigthMax[i])-h[i];
   TrappingWater+=water;
  }
        return TrappingWater;
    }
}
