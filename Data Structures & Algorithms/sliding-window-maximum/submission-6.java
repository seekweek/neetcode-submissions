class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
       ArrayList<Integer>maxA=new ArrayList<>();


        for(int i=0;i<=nums.length-k;i++){
           int max=Integer.MIN_VALUE;
          
              
              for(int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
              }
              maxA.add(max);
           }
          
        

        int arr[]=new int[maxA.size()];
        int idx=0;
        for(int e:maxA){
            arr[idx++]=e;
        }
     return arr;

    }
}
