class Solution {
    public int tribonacci(int n) {
        int a=0,b=1,c=1,ans=0;
        if(n==0)
        return a;
        else if(n==1)
        return b;
        else if(n==2)
        return c;

        for(int i=3; i<=n; i++)
        {
            ans = a+b+c;
            a=b;
            b=c;
            c=ans;
        }
        return ans;
    }
}
