class Solution{
    public int peakIndexInMountainArray(int[] arr) {
        int ans=binarySearch( arr);
        return ans;
    } 
    static int binarySearch(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start != end) {
            int mid = start + (end - start) / 2;

            if (arr[mid+1] < arr[mid]) {
                end = mid;
            } else if(arr[mid+1]> arr[mid]) {
                start = mid + 1;
            } 
        }
     return start;
    }
  
}
        
