class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1]-arr[0]; int d1;
        for(int i=2;i<arr.length;i++)
        {
            d1 = arr[i]-arr[i-1];
            if(d1!=d)
            return false; 
        }
        return true;
    }
}
