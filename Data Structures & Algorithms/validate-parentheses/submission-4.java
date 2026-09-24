class Solution {
    public boolean isValid(String s) {

        Stack<Character>st=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='[' ||c=='(' || c=='{'){
                st.add(c);
            }else{
                if(!st.isEmpty()){
                char m=st.peek();
                   if(m=='(' && c==')' || m=='[' && c==']' ||m=='{' && c=='}'){
                    st.pop();
                    }else{
                    return false;
                    }

                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
