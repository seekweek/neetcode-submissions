class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          List<List<Integer>>re=new ArrayList<>();
           HashSet<List<Integer>>set=new HashSet<>();
        int l=nums.length;

        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                for(int k=j+1;k<l;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer>a=new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        Collections.sort(a);

                        if(!set.contains(a)){
                           re.add(a);
                          
                        }
                        set.add(a);
                        
                    }
                }
            }
        }
        return re;
    }
}
