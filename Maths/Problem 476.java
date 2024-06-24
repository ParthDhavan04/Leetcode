class Solution {
    public int findComplement(int num) {
        int a=0;
        int n=0;
        while(n < num){
            n = (n << 1 | 1);// to create a number n with as many 1 bits as there are total bits in num
        }
        
        a=num^n;
        return a;
    }
    
}
