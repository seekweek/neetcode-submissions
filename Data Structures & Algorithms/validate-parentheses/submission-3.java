class Solution {
    public boolean isValid(String str) {
     
     Stack<Character>st=new Stack<>();
        
        for(int i=0;i<str.length();i++){
                
                if(str.charAt(i)=='{' || str.charAt(i)=='['|| str.charAt(i)=='('){
                        st.push(str.charAt(i));
                }else{
                        if(!st.isEmpty()){
                                
                        char c=str.charAt(i);
                        
                        char top=st.peek();
                        
                        if(top=='(' && c==')' || top=='{' && c=='}' ||top=='[' && c==']' ){
                         
                         st.pop();
                        }else{
                            return false;
                        }  
                        }else{
                            return false;
                        }
                }
        }
     
      
      if(!st.isEmpty()){
        return false;
      }

      return true;
     
        
    }
}
