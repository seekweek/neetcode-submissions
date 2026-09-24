class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0 || s.length()==1){
            return s.length();
        }

        HashSet<Character>set=new HashSet<>();

        int  left=0;
        int rigth=0;
        int maxLen=0;

        while(rigth<s.length()){
            while(!set.isEmpty() && set.contains(s.charAt(rigth))){
                set.remove(s.charAt(left));
                left++;

            }
            
            int len=rigth-left+1;
            maxLen=Math.max(maxLen,len);
            set.add(s.charAt(rigth));
            rigth++;
        }
        return maxLen;
    }
}
