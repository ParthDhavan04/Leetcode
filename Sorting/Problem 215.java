class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            return nums[nums.length-k];
        }
        return nums[nums.length];
    }
}
