class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        // total sum of chalk required for one full round
        long sum = 0;
        for (int i = 0; i < chalk.length; i++) 
            sum += chalk[i];
        
        // chalk left after completing as many full rounds
        int rem = (int) ((long) k % sum);

        //now which student will run out of chalk
        for (int i = 0; i < chalk.length; i++) {
            if (rem < chalk[i]) 
                return i; 
            rem -= chalk[i];
        }
        return 0;
    }
}
