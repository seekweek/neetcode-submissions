class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>>reSult=new ArrayList<>();

        boolean visit[]=new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            if(!visit[i]){
                visit[i]=true;
                List<String>group=new ArrayList<>();
                group.add(strs[i]);


               for(int j=i+1;j<strs.length;j++){
                if(!visit[j]  && isAnagram(strs[i],strs[j])){
                    visit[j]=true;
                    group.add(strs[j]);

                }
               }
                reSult.add(group); 
            }
        }
        

        return reSult;
    }

    public static  boolean isAnagram(String s1,String s2){
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);


        String s=new String(ch1);
        String ss=new String(ch2);

        return s.equals(ss);

    }
}
