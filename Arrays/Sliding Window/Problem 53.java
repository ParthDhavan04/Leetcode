class Solution {
    //KADANE'S ALGORITHM
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int best=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            best=Math.max(best,sum);
        }
        return best;
    }
}  
