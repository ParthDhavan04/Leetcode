class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //elements are distinct here so we can use map
        int l=nums2.length;
        int n=nums1.length;
        int[] ans=new int[n];
        
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<l;i++){
            while(!st.isEmpty() && nums2[i] > st.peek()){
                int popped=st.pop();
                map.put(popped,nums2[i]);
            }
            st.push(nums2[i]);
        }

        for(int i=0;i<n;i++){
            ans[i]=map.getOrDefault(nums1[i],-1);
        }
        return ans;

        
    }
}
