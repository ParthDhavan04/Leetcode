class Solution{
    public int binaryGap(int n) {
        int count = 0, max = 0;
        int oneIndex = Integer.MAX_VALUE;

        while(n!=0)
        {
            int lastBit = n & 1;

             if (lastBit == 1 ) {
                max = Math.max(max, count - oneIndex);
                oneIndex = count;  //holds occurence of 1 to later calculate distance 
            }
            n = n >>1; count++;
        }

        return max;
    }
}
