class Solution {
    public int maxArea(int[] h) {

        int ContainsMostWater=0;

        // for(int i=0;i<h.length;i++){

        //     for(int j=i+1;j<h.length;j++){
        //         int dis=(j-i);
        //         int min=Math.min(h[i],h[j]);
                
        //         int containsW=dis*min;

        //         ContainsMostWater=Math.max(ContainsMostWater,containsW);
        //     }
        // }
        // return ContainsMostWater;


    //     int left=0;
    //     int rigth=h.length-1;

    //     while(left<=rigth){
    //     int dis=rigth-left;
    //     int minH=Math.min(h[left],h[rigth]);
    //     int Water=dis*minH;
    //     ContainsMostWater=Math.max(ContainsMostWater,Water);

    //     if(h[left]<h[rigth]){
    //         left++;
    //     }else{
    //         rigth--;
    //     }


    //     }

    //     return ContainsMostWater;

    int Container=0;
    int left=0;
    int rigth=h.length-1;


    while(left<=rigth){
        int dis=rigth-left;
        int minH=Math.min(h[left],h[rigth]);
        int waterU=dis*minH;
        Container=Math.max(Container,waterU);
         if(h[left]<h[rigth]){
            left++;
         }else{
            rigth--;
         }

    }
  return Container;
  

     }
}
