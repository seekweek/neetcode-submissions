class Solution {
    public int lengthOfLongestSubstring(String s) {
        
//         HashSet<Character>set=new HashSet<>();

//         String str="";
//   int l=0;
//         for(int i=0;i<s.length();i++){
//             if(!set.contains(s.charAt(i))){
//                 str+=s.charAt(i);
//                 set.add(s.charAt(i));
//             }else{
                
//                     l=Math.max(l,str.length());
//                      int idx=str.indexOf(s.charAt(i));
//                      str=str.substring(idx+1)+s.charAt(i);

//                      set.clear();
//                      for(char c:str.toCharArray()){
//                         set.add(c);
//                      }
//                 }
             
//         }
//         l=Math.max(l,str.length());
//         return l;
if(s.length()<=1){
    return s.length();
}

 
 HashSet<Character>set=new HashSet<>();

 int left=0;
 int rigth=0;
 int maxL=0;

 while(rigth<s.length()){
    while( set.contains(s.charAt(rigth))){
        set.remove(s.charAt(left));
        left++;
        
        
    }
    int len=rigth-left+1;
    maxL=Math.max(maxL,len);
set.add(s.charAt(rigth));
rigth++;
 }


return maxL;

    }
}
