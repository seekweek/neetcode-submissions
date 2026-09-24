

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    //     //Step 1:
    //     HashMap<Integer,Integer>map=new HashMap<>();
        
    //     // Stpe 2:
    //     for(int e:arr){
    //            if(map.containsKey(e)){
    //             map.put(e,map.get(e)+1);
    //            }else{
    //             map.put(e,1);
    //            }
    //     }
        
    //     //Step 3:

    //     List<Map.Entry<Integer,Integer>>KeyVal = new ArrayList<>(map.entrySet());
       
    //    //Step 4: sort desending order.
    //      KeyVal.sort((a,b)-> b.getValue()-a.getValue());
        

    //     int re[]=new int[k];

    //     for(int i=0;i<k;i++){
    //         re[i]=KeyVal.get(i).getKey();
    //     }


            HashMap<Integer,Integer>map=new HashMap<>();

            for(int e:nums){
                if(!map.containsKey(e)){
                    map.put(e,1);
                }else{
                    map.put(e,map.get(e)+1);
                }
            }
     List<Map.Entry<Integer,Integer>>keyG=new ArrayList<>(map.entrySet());
     
     keyG.sort((a,b)-> b.getValue() - a.getValue());
     
     int arr[]=new int[k];

     for(int i=0;i<k;i++){
        arr[i]=keyG.get(i).getKey();
     }
       return arr;
       
    }
}
