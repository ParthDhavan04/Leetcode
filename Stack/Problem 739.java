class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] nge=new int[n];

        Stack<Integer> st=new Stack<>();
        Arrays.fill(nge,0);

        for(int i=0;i<n;i++){
            while( !st.isEmpty() && temperatures[i]> temperatures[st.peek()]){
                int prev=st.pop();
                nge[prev]=i-prev;
            }
            st.push(i);
        }
        return nge;
    }
}
