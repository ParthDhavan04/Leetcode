class Solution{
    public int findGCD(int[] nums) {
        int max1 = Integer.MIN_VALUE;  
        int min1 = Integer.MAX_VALUE, n;
        
        for(int i=0;i<nums.length;i++)
        {
            n = nums[i];
            if (n > max1) {
                max1 = n;
            }
            if (n < min1) {
                min1 = n;
            }
            
        }
        int a;
        a=gcd(min1,max1);
        return a;
    
        
    }
    static int gcd(int a, int b)
    {
        // if b=0, a is the GCD
        if (b == 0)
            return a;
 
        // call the gcd() method recursively by
        // replacing a with b and b with
        // modulus(a,b) as long as b != 0
        else
            return gcd(b, a % b);
    }
}
