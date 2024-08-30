class Solution {
    public boolean divideArray(int[] nums) {
        //XOR will not work bcoz other than cancelling out and giving 0 some other array elements might also give zero
        
        int maxVal = 0;
        for (int num : nums) {
            if (num > maxVal) 
                maxVal = num;
            
        }

        int[] freq = new int[maxVal + 1];

        for (int num : nums) {
            freq[num]++;
        }

         for (int count : freq) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;

    }
}
