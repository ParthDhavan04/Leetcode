// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int k=0;
//         for(int i=0; i<nums.length;i++)
//         {
//             if(nums[i]==val)
//                 nums[i]= 51;
//             else
//             k++;
//         }
//         Arrays.sort(nums);
//         return k;
//     }
// }
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to place the next non-val element
        
        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place the non-val element at index k
                k++; // Increment k
            }
        }
        
        // k now represents the number of elements not equal to val
        return k;
    }
}
