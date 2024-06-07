class Solution {
    public void merge(int[] first, int m, int[] second, int n) {
        if(n == 0) return;
        int[] mix = new int[first.length + second.length];
    
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (first[i] < second[j]) 
                mix[k++] = first[i++];
            else 
                mix[k++] = second[j++];
        }

       for( ; i < m; i++) 
            mix[k++] = first[i];

         for( ; j < n; j++) 
            mix[k++] = second[j];

        for (int l = 0; l < m+n; l++) {
            first[l] = mix[l];
        }
    }      
}
