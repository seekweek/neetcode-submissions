class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int e:nums){
            if(!map.containsKey(e)){
                map.put(e,1);
            }else{
                map.put(e,map.get(e)+1);
            }
        }
        int re=0;

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>nums.length/2){
                re=entry.getKey();
            }
        }
        return re;
    }
}