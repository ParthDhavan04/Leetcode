class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int max = Integer.MAX_VALUE;
        int closestSum = 0;

        for(int i=0; i< nums.length-2; i++){
            int start = i+1;
            int end = nums.length-1;

            while(start<end){
                int sum = nums[i] + nums[start] + nums[end];
                //current sum - probable answer
                if(sum == target)
                return sum;

                else if(sum < target)
                start++;

                else
                end--;

                int diff = Math.abs(sum - target);
                 if(diff < max){
                    max = diff;
                    closestSum = sum;
                    }
            }
        }
            return closestSum;
    }
}
