class Solution {
    public int arrangeCoins(int n) {
        long sum = 0, rows=0;
        for(long i=1;i<=n;i++)
        {
            sum = sum + i;
            if(sum>=n){
            rows = i;
            break;
            }
        }
        int c = 0;
        for(int i=1;i<=rows;i++){
        if(n<=0)
        break;
        if(n>=i){
        n=n-i;
        c++;
        }
        else{
        n=n-i;
        }

       }
        return c;
    }
}
