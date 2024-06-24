class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0)
        {
            int lastBit = n & 1;
            int secondLastBit = (n >> 1) & 1;
           if ((lastBit ^ secondLastBit) == 0)
           return false;
           n= n>>1;
        }
        return true;
    }
}
