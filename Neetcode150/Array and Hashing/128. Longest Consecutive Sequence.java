class Solution {
    public int longestConsecutive(int[] nums) {

        //Sorting and doing it takes O(nlogn) time 
        //so optimal approach is to use HashSet
        
        // Edge case: if the array is empty, return 0
        if (nums.length == 0) return 0;

        // Use a HashSet for O(1) lookup time
        HashSet<Integer> numSet = new HashSet<>();

        // Add all numbers to the set
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }

        int LConS = 0; // Stores the length of the longest consecutive sequence

        // Traverse each number in the set
        for (int num : numSet) {

            // Only start counting if 'num' is the beginning of a sequence
            if (!numSet.contains(num - 1)) {

                int currNum = num;  // Start of sequence
                int currSub = 1;    // Current sequence length

                // Check how long the sequence continues
                while (numSet.contains(currNum + 1)) {
                    currNum++;
                    currSub++;
                }

                // Update the global max
                LConS = Math.max(LConS, currSub);
            }
        }

        // Return the longest sequence found
        return LConS;
    }
}
