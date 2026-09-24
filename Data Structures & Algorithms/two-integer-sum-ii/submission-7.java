class Solution {
    public int[] twoSum(int[] num, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]=new int[2];
        for(int e=0;e<num.length;e++){
            int com=target-num[e];
            if(map.containsKey(com)){
            arr[0]=map.get(com)+1;
            arr[1]=e+1;
            }
            map.put(num[e],e);
        }
        return arr;
    }
}
