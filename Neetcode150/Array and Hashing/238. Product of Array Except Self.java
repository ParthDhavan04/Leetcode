class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];

        // Fill the result array with 1s initially
        // This helps in multiplication (1 is the identity for multiplication)
        Arrays.fill(result, 1);

        int pre = 1;  // Stores the product of all elements to the left of current index

        // First pass: Calculate prefix products
        for (int i = 0; i < nums.length; i++) {
            result[i] = pre;         // Assign the product so far (excluding current)
            pre = pre * nums[i];     // Update prefix product including current element
        }

        int post = 1;  // Stores the product of all elements to the right of current index

        // Second pass (from end): Multiply with postfix products
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * post;  // Multiply the current result with right-side product
            post = post * nums[i];         // Update postfix product including current element
        }

        return result;  // Final array with product of all elements except self
    }
}
