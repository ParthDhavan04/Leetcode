class Solution {
    public int[] findErrorNums(int[] nums) {

        sort(nums);
        int[]arr=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                arr[0]=nums[i];
                arr[1]=i+1;
            }
        }
        
        return arr;
    }
    void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) 
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
