class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character,Integer>map=new HashMap<>();

        int maxFreq=0;

        int left=0;

        int right=0;

        int maxLen=0;

        while(right<s.length()){
           
           char c=s.charAt(right);

           map.put(c,map.getOrDefault(c,0)+1);

           maxFreq=Math.max(maxFreq,map.get(s.charAt(right)));

           if((right-left+1)-maxFreq> k){
             map.put(s.charAt(left),map.get(s.charAt(left))-1);

             left++;

           }

           maxLen=Math.max(maxLen, right-left+1);
           right++;
        }
        

        return maxLen;
    }
}
