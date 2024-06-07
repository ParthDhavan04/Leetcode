class Solution {
    public int[] sortArray(int[] nums) {
        int[] ans=mergeSort(nums);
        return ans;   
    }
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) 
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) 
                mix[k++] = first[i++];
            else 
                mix[k++] = second[j++];
        }
          
        // copy the remaining elements
        for( ; i < first.length; i++) 
            mix[k++] = first[i];

        for( ; j < second.length; j++) 
            mix[k++] = second[j];
        
        return mix;
    }
}
