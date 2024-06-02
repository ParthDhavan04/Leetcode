class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        int start=0;
        int end=arr.length-1;
        int sum=arr[start]+arr[end];

        while(sum!=target){

            sum=arr[start]+arr[end];

            if(sum>target){
                end--;
            }
            else if(sum<target){
                start++;
            }   
        }
        int[] ans=new int[2];
        ans[0]=start+1;   //  +1 because of 1 Indexed array
        ans[1]=end+1;
        return ans;

    }
}
