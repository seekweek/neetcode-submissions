class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer>re=new ArrayList<>();
        int l=nums.length;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int e:nums){
            if(!map.containsKey(e)){
                map.put(e,1);
            }else{
                map.put(e,map.get(e)+1);
            }
        }

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>l/3){
                re.add(entry.getKey());
            }
        }
        return re;
    }
}