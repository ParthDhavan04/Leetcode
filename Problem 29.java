class Solution {
    public int divide(int dividend, int divisor) {

        if(dividend==divisor){
            return 1;
        }

        boolean sign = true; // positive

        if(dividend >=0 && divisor <0){
            sign =false;
        }

        if(dividend <0 && divisor >0){
            sign =false;
        }

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans=0;

        while(n>=d){
            int c=0;

            while(n>=(d<<(c+1))){
                c++;
            }

            ans=ans+(1L<<c);
            n=n-(d<<c);
        }

            if (ans > Integer.MAX_VALUE) {
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }


        return sign? (int) ans : (int) -ans;
   
    }
}
