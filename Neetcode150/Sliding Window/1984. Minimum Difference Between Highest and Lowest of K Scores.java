class Solution {
    public int minimumDifference(int[] nums, int k) {
        // If k is 1, difference between one element is 0
        if (k == 1) return 0;

        // Sort the array so that we can consider all windows of size k in order
        Arrays.sort(nums);  // Now the elements are in increasing order

        // Initialize the minimum difference to a large value
        int minDiff = Integer.MAX_VALUE;

        // Slide a window of size k across the sorted array
        for (int i = 0; i <= nums.length - k; i++) {
            // The difference between the largest and smallest in this window
            int diff = nums[i + k - 1] - nums[i];

            // Update the minimum difference if this window has a smaller one
            minDiff = Math.min(minDiff, diff);
        }

        // Return the smallest difference found
        return minDiff;
    }
}
