class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int[] ans=new int[n];
        int k = 0;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<n;j++){
            if(arr2[i]==arr1[j]){
            ans[k++]=arr2[i]; 
            arr1[j]= -1; //mark all values that have been inserted as -1
            }
        }}

        int[] left=new int[n-k]; //remaining elements that havent been added
        int x=0;
        for(int i=0;i<n;i++){
            if(arr1[i]!=-1){
                left[x++]=arr1[i];
            }
        }
        Arrays.sort(left);
        x = 0;
        for(int i=0;i<left.length;i++){
            ans[k++]=left[x++];
        }

        return ans;
    }

}
