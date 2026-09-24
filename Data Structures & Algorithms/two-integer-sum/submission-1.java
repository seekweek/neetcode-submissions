class Solution {
    public int[] twoSum(int[] nums, int target) {
      
       HashMap<Integer,Integer>map=new HashMap<>();

       int res[]=new int[2];

       for(int i=0;i<nums.length;i++){
         int variable=target-nums[i];
        if(map.containsKey(variable)){
            res[0]=map.get(variable);
            res[1]=i;
        }   
       
        map.put(nums[i],i);
       }
        
        return res;
    }
}
