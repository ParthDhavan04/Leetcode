class Solution {
    public int kthFactor(int n, int k) {
        int[] arr=new int[n+1];
        arr[0]=1;
        int j=1;
        for (int i = 2; i <= n; i++){
            if(n%i==0){
                arr[j]=i;
                j++;
            }
        }
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c=i;
                break;
            }
        }
        if(c<k)
        return -1;

        int res=arr[k-1];
        return res;
        
    }
    
}
