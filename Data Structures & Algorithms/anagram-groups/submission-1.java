class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        boolean visit[]=new boolean[strs.length];
        List<List<String>>reSult=new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            if(!visit[i]){
                visit[i]=true;
                List<String>group=new ArrayList<>();
                group.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(!visit[j] && isAnagram(strs[i],strs[j])){
                        visit[j]=true;
                        group.add(strs[j]);
                    }
                    
                }
                reSult.add(group);
            }
            
        }
        return reSult;
    }

    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char []c=s1.toCharArray();
        char [] cc=s2.toCharArray();
         Arrays.sort(c);
        Arrays.sort(cc);
        return Arrays.equals(c,cc);
    }
}
