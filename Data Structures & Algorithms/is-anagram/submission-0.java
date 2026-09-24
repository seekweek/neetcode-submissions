class Solution {
    public boolean isAnagram(String s, String t) {

        
      int hash[]=new int[126];

      for(char e:s.toCharArray()){
        hash[e-'a']++;
      }

      for(char e:t.toCharArray()){
        hash[e-'a']--;
      }

      for(int e:hash){
        if(e!=0){
            return false;
        }
      }
        return true;
      



    }
}
