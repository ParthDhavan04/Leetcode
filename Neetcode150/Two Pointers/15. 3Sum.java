class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Step 1: Sort the array to use two-pointer approach and handle duplicates
        Arrays.sort(nums);

        // Step 2: Create a list to store the resulting triplets
        List<List<Integer>> result = new ArrayList<>();

        // Step 3: Loop through the array
        // Only go till nums[i] <= 0 because if nums[i] > 0, sum will never be 0 (array is sorted)
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {

            // Skip duplicate values for i to avoid repeating the same triplet
            if (i == 0 || nums[i] != nums[i - 1]) {
                // Step 4: Call helper function to find pairs such that nums[i] + nums[left] + nums[right] == 0
                twoSum(nums, i, result);
            }
        }

        // Step 5: Return the final list of unique triplets
        return result;
    }

    // Helper function to find two numbers that sum with nums[i] to 0
    void twoSum(int[] nums, int i, List<List<Integer>> result) {

        // Set two pointers: one just after i, and the other at the end
        int left = i + 1;
        int right = nums.length - 1;

        // Step 6: Two-pointer approach
        while (left < right) {

            int sum = nums[i] + nums[left] + nums[right];

            if (sum < 0) {
                // If sum too small, move left pointer to increase sum
                left++;
            } else if (sum > 0) {
                // If sum too large, move right pointer to decrease sum
                right--;
            } else {
                // Found a valid triplet: nums[i] + nums[left] + nums[right] == 0
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;

                // Skip duplicates for left pointer to avoid repeated triplets
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
            }
        }
    }
}
