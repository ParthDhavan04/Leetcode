class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2]; 
        //IF AN ELEMENT APPEARS MORE THAN HALF
        //SO WE HAVE TWO HALF AFTER SORTING
        //ONE HALF WILL BE COMPETELY FILLED AND OTHER HALF IS PARTIALLY FILLED
        //WHICH MEANS THE ELEMENT MORE THAN ALWAYS APPEAR AT MID
        //SO WE NEED TO RETURN THE MID ELEMENT OF ARRAY     
    }
}
