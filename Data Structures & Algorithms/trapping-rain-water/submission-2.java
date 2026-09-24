class Solution {
    public int trap(int[] h) {


//         int leftMax[]=new int[h.length];
//         int rigthMax[]=new int[h.length];
        
        
//      // pehle Hum left trf ak Max nikalenge ok

//      leftMax[0]=h[0];

//      for(int i=1;i<h.length;i++){
//         leftMax[i]=Math.max( h[i],leftMax[i-1]);
//      }

//      // Yb rigth Max value nikalenge ok 

//      rigthMax[h.length - 1]=h[h.length-1];
//      for(int i=h.length-2;i>=0;i--){
//         rigthMax[i]=Math.max(h[i],rigthMax[i+1]);
//      }


//  // ye yata hai tb  ja ke niklta  hai
// // leftMax    : 0  2  2  3  3  3  3  3  3  3
// // height     : 0  2  0  3  1  0  1  3  2  1
// // rightMax   : 3  3  3  3  3  3  3  3  2  1

//   int TrappingWater=0;
//   for(int i=0;i<h.length;i++){
//    int water= Math.min(leftMax[i],rigthMax[i])-h[i];
//    TrappingWater+=water;
//   }
//         return TrappingWater;


//+++++++ Ajj ka  concept ++++++++++++



int leftMax[]=new int[h.length];

int rigthMax[]=new int[h.length];

// Chlo yb  left max bhrte hain..

leftMax[0]=h[0];

for(int i=1;i<h.length;i++){
    leftMax[i]=Math.max(h[i],leftMax[i-1]);
}


// Chlo  right Max mai bhrte hain

rigthMax[h.length-1]=h[h.length-1];


for(int i=h.length-2;i>=0;i--){
    rigthMax[i]=Math.max(rigthMax[i+1],h[i]);
}


// Water ContainsKrte hain

int TrappingWater=0;

for(int i=0;i<h.length;i++){
    TrappingWater+=Math.min(leftMax[i],rigthMax[i])-h[i];
    
}

return TrappingWater;



    }
}
