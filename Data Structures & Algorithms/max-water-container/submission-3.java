class Solution {
    public int maxArea(int[] arr) {

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
         int ContainerMost=0;
     
     int left=0;
     int rigth=arr.length-1;
     
     while(left<=rigth){
             int dis=rigth-left;
             
             int minH=Math.min(arr[left],arr[rigth]);
             ContainerMost=Math.max(ContainerMost,dis*minH);
             
             if(arr[left]<arr[rigth]){
                     left++;
             }else{
                     rigth--;
             }
     }
     return ContainerMost;
     }
}
