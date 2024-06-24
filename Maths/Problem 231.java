/*Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x. */

//Method - 1 : bit manipulation

class Solution {
    public boolean isPowerOfTwo(int n) {
       
        if(n<=0)
        return false;
        if(n==1)
        return true;
        
        int c = 0;
        while(n>0)
        {
            if((n & 1) == 1)
            c++;
            n = n >> 1;
        }

        if(c==1) return true;
        else return false;
    }
}

//Method - 2 : divide by 2
/*
class Solution {
    public boolean isPowerOfTwo(int n) {
       
        if(n<=0)
        return false;

        if(n==1)
        return true;
        
        while(n!=0 && n!=2)
        {
            if(n%2==1)
            return false;
            n=n/2;
        }
        return true;
    }
}
*/
