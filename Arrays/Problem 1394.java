class Solution{
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int k = 0;
        int n = arr.length;
        int maxLucky = -1;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == -1) {
                continue;
            }
            int c = 0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j])
                c++;
            }
            if(c==arr[i])
            {
                maxLucky = Math.max(maxLucky, arr[i]);
            }
            //make all occurences -1 for tht the element that has been checked as it is a positive array
            for (int j = i; j < i + c; j++) {
                arr[j] = -1;
            }
        }
        
        return maxLucky;
    }
}
