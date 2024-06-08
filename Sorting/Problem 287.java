class Solution {
    public int findDuplicate(int[] nums) {
        /*HashSet<Integer> set = new HashSet<>();//doesnt take duplicates
        for(int num : nums) {
            if(!set.add(num)) {// element which does not get added is the duplicate one
                return num;
            }
        } 
        return -1;*/

        sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return nums.length;
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
