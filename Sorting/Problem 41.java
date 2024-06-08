class Solution {//AMAZON
    public int firstMissingPositive(int[] nums) {
        //USE CYCLE SORT AS ACC TO QUES
        //WE HAVE TO IGNORE NEGATIVE VALUES AND VALUES GREATER THAN LENGHT SO IT AUTOMATICALLY CAME IN RANGE

        sort(nums);

        int ans=nums.length+1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                ans=i+1;
                break;
            }
        }
        
        return ans;
    }

    void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i]<arr.length && arr[i] >0 && arr[i] != arr[correct]) 
                swap(arr, i , correct);
            else 
                i++;    
        }
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
