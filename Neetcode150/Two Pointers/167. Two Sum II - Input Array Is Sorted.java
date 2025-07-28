class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        // Initialize two pointers at the beginning and end of the array
        int start = 0;
        int end = arr.length - 1;

        // Loop until the correct pair is found
        while (start < end) {

            // Calculate the current sum of values at the pointers
            int sum = arr[start] + arr[end];

            if (sum == target) {
                // Found the correct pair; return 1-based indices
                return new int[] {start + 1, end + 1};
            }

            // If current sum is greater than target, move end pointer left
            else if (sum > target) {
                end--;
            }

            // If current sum is less than target, move start pointer right
            else {
                start++;
            }
        }

        // This line will only be reached if no valid pair exists
        return null;
    }
}

