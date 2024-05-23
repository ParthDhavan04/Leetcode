class Solution {
    public int fib(int n) {
        int a=1;
        int b=0;
        int sum=0;

        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            for(int i=2 ;i<=n ;i++){
                sum=b+a;
                b=a;
                a=sum;
            }
            return sum;    
        }
    }
}
