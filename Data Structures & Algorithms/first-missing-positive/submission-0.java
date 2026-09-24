class Solution {
    public int firstMissingPositive(int[] nums) {

        //Step 1:

        HashSet<Integer>set=new HashSet<>();
        for(int e:nums)
        {
            set.add(e);

        }

        //Step 2:
        int l=nums.length;

        for(int i=1;i<=l+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}