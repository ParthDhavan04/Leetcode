class Solution {
    public int[] findRightInterval(int[][] intervals) {

        int n=intervals.length;
        int [][] arr=new int[n][3];//as columns are 2 only and third column is for original index

        for(int i=0;i<n;i++){

            arr[i][0]=intervals[i][0];
            arr[i][1]=intervals[i][1];
            arr[i][2]=i;
        }
        //method to sort 2D arrays using lambda operator
        Arrays.sort(arr,(a,b)->a[0]-b[0]);//sorting based on initial row

        int ans[]=new int[n];

        for(int i=0;i<n;i++){

            ans[arr[i][2]]=binarysearch(arr,i,n-1,arr[i][1]);

        }
        return ans;
        
    }

        int binarysearch(int [][] arr,int start,int end,int target){

         int result = -1; 

         while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid][0] >= target) {
                result = arr[mid][2];  
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }    
}
