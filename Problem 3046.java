class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (nums[i] == -1) {
                continue;
            }
            int c = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j])
                c++;
            }
            if(c>2)// if freq is greater than 2 then we cannot split ibto arrays with distinct elements
            {
                return false;
            }
            for (int j = i; j < i + c; j++) {
                nums[j] = -1;           
            }
        }
        return true;   
    }
}
