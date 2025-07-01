class Solution {
    public int climbStairs(int n) {

        // WE APPLY DP WHEN THERE ARE OVERLAPPING SUBPROBLEMS (same subproblems solved multiple times) AND HAS OPTIMAL SUBSTRUCTURE(solution can be built from sub-solutions)

        if(n<=2) return n;
    
        int dp[]=new int[n+1];
        dp[0]=1; //1 way to stay on ground
        dp[1]=1; //1 way to reach 1 stair

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]; //we are storing no of steps required to reach a particular stair in subsets of 1 or 2 steps 
        }

        return dp[n];
    }
}
