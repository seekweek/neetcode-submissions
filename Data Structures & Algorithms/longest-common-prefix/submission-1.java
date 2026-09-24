class Solution {
    public String longestCommonPrefix(String[] strs) {
        

        Arrays.sort(strs);

        char ch[]=strs[0].toCharArray();
        char ch1[]=strs[strs.length-1].toCharArray();


        String re="";

        for(int i=0;i<ch.length;i++){
          if(ch[i]!=ch1[i]){
            break;
          }
          re+=ch[i];
            

        }

        return re;
    }
}