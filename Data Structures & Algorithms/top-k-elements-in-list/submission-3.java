class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer>map=new HashMap<>();


        for(int e:nums){
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }else{
                map.put(e,1);
            }
        }
       List<Map.Entry<Integer,Integer>>arr=new ArrayList<>(map.entrySet());

       arr.sort((a,b)-> b.getValue()-a.getValue());

       int arrs[]=new int[k];

       for(int i=0;i<k;i++){
         arrs[i]=arr.get(i).getKey();
       }

     return arrs;


        
    }
}
