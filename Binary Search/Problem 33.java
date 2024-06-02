class Solution {

    public int search(int[] nums,int target){
        int pivot = findPivot(nums);

        //if you did not find the pivot ,it mreans that the array is not rotated
        if(pivot==-1){
            //just do normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }
        //if pivot is found you have found 2 asc sorted arrays
        //CASE 1:
        if(nums[pivot]==target){
            return pivot;
        }
        //CASE 2:
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        //CASE3:
        return binarySearch(nums,target,pivot+1,nums.length-1);
        
    }

    int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    //this will not work for duplicate elements
    int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
    
        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
               return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return-1;
    }
}
