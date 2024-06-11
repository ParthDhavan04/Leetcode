class Solution {
    public int equalSubstring(String s, String t, int maxCost) {

        int n=s.length();
        int curCost=0;
        int left=0;
        int ans=0;

        for(int i=0;i<n;i++){
            curCost=curCost + Math.abs(s.charAt(i)-t.charAt(i));

            while(curCost>maxCost){
                curCost=curCost - Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            ans=Math.max(ans,i-left+1);//+1 for index
        }
        return ans;
        
    }
}
