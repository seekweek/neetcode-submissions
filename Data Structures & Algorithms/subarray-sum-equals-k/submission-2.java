class Solution {
    public int subarraySum(int[] nums, int k) {

        // Step 1:
        // int Cnt=0;

        // for(int i=0;i<nums.length;i++){
        //       int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];

        //         if(sum==k){
        //             Cnt++;
        //         }
        //     }
        // }
      
      int Cnt=0;

      HashMap<Integer,Integer>map=new HashMap<>();
      map.put(0,1);
      int currentSum=0;

      for(int i=0;i<nums.length;i++){
        currentSum+=nums[i];

        if(map.containsKey(currentSum-k)){
            Cnt+=map.get(currentSum-k);
        }



        if(!map.containsKey(currentSum)){
            map.put(currentSum,1);
        }else{
            map.put(currentSum, map.get(currentSum)+1);
        }
      }
      

        return Cnt;
    }
}

// for this question time complexity is that 0(n2)