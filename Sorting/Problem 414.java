class Solution {
public static int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int max1,max2 = Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        max1 = nums[nums.length-1];

        if(nums.length<3)
            return max1;
        int j=0;
        int c=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]!= max1) {
            max2 = nums[i]; 
            j=i;
            break;
            } 
        }
        for(int i=j-1;i>=0;i--)
        {
            if(nums[i]!=max2) {
                max3 = nums[i];
                c=1;
                break;
            }
            
        }

        if(c==1){
        return max3;
        } 
        else
        return max1;

     

    } 
} 
