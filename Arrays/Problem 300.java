class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[]output = new int[n];
        output[0]=1;

        for (int i = 1; i < n; i++) {
            output[i]=1;
            for (int j = i-1; j >=0; j--) {
                if (nums[j] >= nums[i]) 
                continue;

                int pA = output[j]+1;
                if(pA>output[i])
                output[i]=pA;
                }}
        int best=1;
        for(int i=0;i<n;i++) {
            if(output[i]>best)
            best = output[i];  
            }

        return best;
    }
}
