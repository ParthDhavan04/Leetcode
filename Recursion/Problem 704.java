class Solution {
    public int search(int[] arr, int target) {

        return binarysearch(arr,target,0,arr.length-1);
      
        
    }
     public int binarysearch(int[] arr, int target,int s,int e) {

        if(s>e){
            return -1;
        }

        int mid=s+(e-s)/2;

        if(target==arr[mid]){
            return mid;
        }

        if(target>arr[mid]){
            return binarysearch(arr,target,mid+1,e);
        }

        
         return binarysearch(arr,target,s,mid-1);
        
    
        
    }
}

    
