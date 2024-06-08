/* Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

case 1 - product of 3 maximum numbers
case 2 - product of 2 min (-ve numbers) and 1 max (+ve) */

class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE; 
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, n;
        for(int i=0;i<nums.length;i++)
        {
            n = nums[i];
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) 
                max3 = n;
// if there are negative numbers and if I multiply two negative numbers then the resultant will be positive.
//so we take the least and second least min as their product would be more and muliply it with max product
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) 
                min2 = n;
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
        }

        /*
        //By sorting
        Arrays.sort(nums);
        int case1 = nums[0]*nums[1]*nums[nums.length-1];//as at ind 0 and 1 ,biggest -ve integer will be there
        int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int maxProduct = Integer.max(case1, case2);
        return maxProduct;*/

 }
