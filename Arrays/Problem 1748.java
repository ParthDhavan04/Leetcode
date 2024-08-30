class Solution {
    public int sumOfUnique(int[] nums) {
        //nums=Arrays.sort(nums);
        int n=nums.length;
        int flag=0;
        int sum=0;
        
        for(int i=0;i<n;i++){
            flag=0;
            for(int j=0;j<n;j++){
                if( i!=j && nums[i]==nums[j]){
                   flag=1;
                }
            }
            if(flag==0){
                sum +=nums[i];
            }
        }
        return sum;


    }
}
