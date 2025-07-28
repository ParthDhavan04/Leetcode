class Solution {
    // KADANE'S ALGORITHM - Finds the maximum sum of a contiguous subarray
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        // 'sum' stores the maximum subarray sum ending at the current index
        int sum = 0;

        // 'best' keeps track of the overall maximum subarray sum found so far
        int best = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // At each step, we decide:
            // 1. Start a new subarray from current element: nums[i]
            // 2. Extend the previous subarray by adding nums[i] to sum
            // We choose whichever is greater
            sum = Math.max(nums[i], sum + nums[i]);

            // Update the best sum found so far
            best = Math.max(best, sum);
        }

        // Return the maximum subarray sum found
        return best;
    }
}
