class Solution {

    public String encode(List<String> strs) {

        StringBuilder encode=new StringBuilder();

        for(String str:strs){
            encode.append(str.length()).append("#").append(str);
        }
      return encode.toString();
    }

    public List<String> decode(String s) {
            
            List<String>decode=new ArrayList<>();

            int i=0;

            while(i<s.length()){

                int j=i;

                while(s.charAt(j)!='#'){
                    j++;
                }

                int len=Integer.parseInt(s.substring(i,j));

                String word=s.substring(j+1,j+1+len);

                decode.add(word);
                i=j+1+len;
            }
            return decode;
    }
}
