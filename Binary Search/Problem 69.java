class Solution{
    public int mySqrt(int x) {
        //int ans=(int)Math.sqrt(x);
        //return ans;
        
        if(x==0 || x==1){
            return x;
        }
        long start=1;
        long end=x/2;
        long result=0;

        while(start<=end){
            long mid=start + (end-start)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid<x){
                start=mid+1;
                result=mid;
            }
            else{
                end=mid-1;
            }
        }
        return (int)result;
    }
}
