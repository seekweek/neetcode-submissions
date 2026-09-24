class Solution {
    public String mergeAlternately(String word1, String word2) {

        String reSult="";

       int left=0;
       int length=0;

       if(word1.length()>=word2.length()){
        length=word1.length();
       }else{
        length=word2.length();
       }

       while(left<length)
        {

            if(left<word1.length()){
                reSult+=word1.charAt(left);
            }
             if(left<word2.length()){
              reSult+=word2.charAt(left);
             }
             
        left++;
            
        }

        return reSult;
    }
}