class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        /*
        Approach: Sliding Window + HashSet
            Use two pointers (left, right) to define a window.
            Use a Set to track elements in the window.
            Expand the window by moving right, and:
            If nums[right] is not in the set: add it, update the current sum.
            If nums[right] is in the set: shrink the window from left until it's removed.
            At each step, track the maximum sum.
        */

        int left = 0;
        int right = 0;
        int sum = 0;
        int maxSum = 0;

        Set<Integer> set = new HashSet<>();

        while (right < nums.length) {
            if (!set.contains(nums[right])) {
                // Expand the window
                set.add(nums[right]);
                sum += nums[right];
                maxSum = Math.max(maxSum, sum);
                right++;
            } else {
                // Shrink the window from the left
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}
