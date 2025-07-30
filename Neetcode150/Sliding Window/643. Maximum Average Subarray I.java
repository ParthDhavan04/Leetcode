class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate the sum of the first window of size k
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        // This will be updated as we slide the window
        double currentSum = maxSum;

        // Step 2: Slide the window from index k to end of array
        for (int i = k; i < nums.length; i++) {
            // Slide window forward by removing one and adding one
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        // Step 3: Return the average of the max sum window
        return maxSum / k;
    }
}
