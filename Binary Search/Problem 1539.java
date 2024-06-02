class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]-(mid+1) < k)
//diff. in expected value at index mid if there were no missing no.s & actual value in arr[mid]
            start = mid + 1;
            else
            end = mid - 1;
        }
        return start+k; //where first missing integer sequence begins + kth integer
    }
}
