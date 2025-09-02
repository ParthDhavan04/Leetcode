class Solution {

    public int robLinear(int[] nums){
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];

        int dp[]=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];

         // Scenario 1: Rob houses from 0 to n-2 (excluding the last house)
        int[] sub1 = Arrays.copyOfRange(nums, 0, n - 1);
        int result1 = robLinear(sub1);

        // Scenario 2: Rob houses from 1 to n-1 (excluding the first house)
        int[] sub2 = Arrays.copyOfRange(nums, 1, n);
        int result2 = robLinear(sub2);

        // Return the maximum of the two scenarios
        return Math.max(result1, result2);

    }
}
