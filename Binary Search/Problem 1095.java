/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution{
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakElement(mountainArr);
        int ans = orderAgnostic (mountainArr, target,true,0,peak);
        if(ans != -1){
            return ans;
        }
        else{
        ans = orderAgnostic (mountainArr, target,false,peak,mountainArr.length()-1);
        return ans;
        }
    }


    public int findPeakElement(MountainArray arr) {
        
        int start = 0, end= arr.length()-1;
        int ans = binarySearch(arr,start,end);
        return ans;
    }

     int binarySearch(MountainArray arr, int start, int end) {
        while(start != end) {

            int mid = start + (end - start) / 2;

            if (arr.get(mid) < arr.get(mid+1)) {
                start = mid + 1;
            } else if ( arr.get(mid) > arr.get(mid+1) ){
                end = mid;
        }
       
    }
     return start;   //or return end since when loop ends both point to same number
}
    int orderAgnostic (MountainArray arr, int target,boolean isAsc,int start,int end){
    while(start <= end) {
            int mid = start + (end - start) / 2;
            int midval=arr.get(mid);

            if (midval == target) {
                return mid;
            }

            if (isAsc) {
                if (target < midval) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midval) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
