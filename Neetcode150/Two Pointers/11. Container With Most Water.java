class Solution {
    public int maxArea(int[] height) {

        // Start with two pointers at the beginning and end of the array
        int left = 0;
        int right = height.length - 1;

        // This will keep track of the maximum area found
        int max = 0;
     
        // Continue until the two pointers meet
        while (left < right)
        {   
            // Calculate the width between the two lines
            int width = right - left;

            // Find the height of the smaller line
            // Multiply by width to get the current area
            int area = Math.min(height[left], height[right]) * width;

            // Update max area if this one is bigger
            max = Math.max(max, area);
                         
            // Move the pointer pointing to the shorter line inward
            // This gives a chance to find a taller line and possibly bigger area
            if (height[left] < height[right])
                left++;   
            else
                right--;
        }

        // Return the maximum area found
        return max;
    }
}
