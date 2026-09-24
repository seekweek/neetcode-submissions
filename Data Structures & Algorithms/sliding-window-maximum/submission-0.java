class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        //Step 1:
        ArrayList<Integer>arr=new ArrayList<>();
        
        // Step 2:
        
        for(int i=0;i+k<=nums.length;i++){
              ArrayList<Integer>re=new ArrayList<>();

              for(int j=i;j<i+k;j++){
                 re.add(nums[j]);
              }
              Collections.sort(re);
               arr.add(re.get(re.size()-1));  

        }
    
     int goup[] =new int[arr.size()];
     
     for(int i=0;i<arr.size();i++){
        goup[i]=arr.get(i);
     }
  return goup;
        
    }
}
