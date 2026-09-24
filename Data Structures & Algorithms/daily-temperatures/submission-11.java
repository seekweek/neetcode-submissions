class Solution {
    public int[] dailyTemperatures(int[] temp) {

        Stack<Integer>st=new Stack<>();
        
        int Temp[]=new int[temp.length];

    
        for(int right=temp.length-1;right>=0;right--){

            while(!st.isEmpty() && (temp[right]>=temp[st.peek()])){
                st.pop();
            }
           
           if((! st.isEmpty()) && temp[st.peek()]> temp[right]){
            Temp[right]=st.peek()-right;
           }

           st.push(right);
        }
        return Temp;
    }
}
