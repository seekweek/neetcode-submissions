class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int k=0;
        for(int e:nums){
            if(!set.contains(e)){
            set.add(e);
            nums[k]=e;
            k++;
            }
        }

        return k;
        
    }
}