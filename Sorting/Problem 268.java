class Solution {
    public int missingNumber(int[] nums) {

        sort(nums);
        int a=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==a){
                a++;
            }else{
                break;
            }
        }
        return a;

       
        /*Arrays.sort(nums);
        int a=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==a){
                a++;
            }else{
                break;
            }
        }
        return a;*/
     
    }
    void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i]<arr.length && arr[i] != arr[correct]) 
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
