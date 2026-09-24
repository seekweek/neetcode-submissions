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
      
       int Diary=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();

        map.put(0,1);
        int Cnt=0;

        for(int i=0;i<nums.length;i++){
            Diary+=nums[i];

            if(map.containsKey(Diary-k)){
                Cnt+=map.get(Diary-k);
            }
            if(map.containsKey(Diary)){
                map.put(Diary,map.get(Diary)+1);
            }else{
                map.put(Diary,1);
            }
        }


        return Cnt;
    }
}

// for this question time complexity is that 0(n2)