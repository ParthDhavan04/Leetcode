class Solution {
    public boolean isPalindrome(int n) {
         if(n<0)
        return false;

    int k=n,rev=0;
     while(n!=0)
     {
    int r=n%10;
    if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
    return false;
     rev=(rev*10)+r;
     n/=10;
     }
     if(rev==k) 
     return true;
     else
     return false;  
    }
}
