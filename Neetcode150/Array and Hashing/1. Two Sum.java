class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Create a HashMap to store (number -> index)
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Calculate the difference between the target and the current element
            int diff = target - nums[i];

            // If the difference already exists in the map, we found the pair
            if (map.containsKey(diff)) {
                // Return the indices of the two numbers that add up to the target
                return new int[]{map.get(diff), i};//get gives index number
            }

            // Otherwise, store the current number and its index in the map
            // This will help us check for its complement later
            map.put(nums[i], i);
        }

        // If no pair is found (the problem says there will always be one, so this is just fallback)
        return null;
    }
}
