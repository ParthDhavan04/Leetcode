class Solution {
    public int trap(int[] height) {

        // Initialize two pointers at both ends of the array
        int left = 0;
        int right = height.length - 1;

        // Variable to store total trapped water
        int total = 0;

        // Keep track of the max height seen so far from both sides
        int leftMax = height[0];
        int rightMax = height[right];

        // Process until the two pointers meet
        while(left < right){

            // If left bar is shorter, process from left side
            if(height[left] < height[right]){
                // Update the highest bar seen so far on the left
                leftMax = Math.max(leftMax, height[left]);

                // Water can be trapped only if leftMax > current height
                if(leftMax - height[left] > 0){
                    total += (leftMax - height[left]);
                }

                // Move left pointer inward
                left++;
            }
            else {
                // Otherwise process from right side
                rightMax = Math.max(rightMax, height[right]);

                // Water can be trapped only if rightMax > current height
                if(rightMax - height[right] > 0){
                    total += (rightMax - height[right]);
                }

                // Move right pointer inward
                right--;
            }
        }

        // Return the total water trapped
        return total;
    }
}
